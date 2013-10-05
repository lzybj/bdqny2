package com.bdqn.hibernate.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.dao.IFilmInfoDAO;
import com.bdqn.hibernate.domain.FilmInfo;
import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.res.ResObj;

public class FilmInfoDAOImp implements IFilmInfoDAO {
	
	private FilmInfoDAOImp(){
	}
	
	public static FilmInfoDAOImp getInstance(){
		return new FilmInfoDAOImp();
	}

	public boolean insertFilmInfo(FilmInfo filminfo) {
		boolean isCommit = true;
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		try {
			session.save(filminfo);
		} catch (Exception e) {
			// TODO: handle exception
			isCommit = false;
			e.printStackTrace();
		}
		if(isCommit){
			t.commit();			
		}else{
			t.rollback();
		}
		HibernateSessionFactory.closeSession();
		if(isCommit){
			return true;
		}
		return false;
	}

	public List<ResObj> selectByParam(String param) {
		// TODO Auto-generated method stub
		String hsql = "select new com.bdqn.hibernate.res.ResObj" +
				"(" +
				"fi.filmname,ft.typename,fi.actor,fi.director,fi.ticketprice" +
				") " +
				"from FilmInfo fi " +
				"inner join fi.filmType ft " +
				"where 1 = 1 " + param;
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		List<ResObj> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}

}

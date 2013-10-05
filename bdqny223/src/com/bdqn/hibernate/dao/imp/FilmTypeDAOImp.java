package com.bdqn.hibernate.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.dao.IFilmTypeDAO;
import com.bdqn.hibernate.domain.FilmType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class FilmTypeDAOImp implements IFilmTypeDAO {

	private FilmTypeDAOImp(){
	}
	
	public static FilmTypeDAOImp getInstance(){
		return new FilmTypeDAOImp();
	}
	
	public List<FilmType> selectAll() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from FilmType";
		Query query = session.createQuery(hsql);
		List<FilmType> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}
	
	public FilmType selectByID(Integer typeid) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		FilmType ft = (FilmType)session.get(FilmType.class,typeid);
		HibernateSessionFactory.closeSession();
		return ft;
	}

}

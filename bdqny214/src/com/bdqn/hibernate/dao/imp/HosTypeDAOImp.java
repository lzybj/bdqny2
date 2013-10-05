package com.bdqn.hibernate.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.dao.IHosTypeDAO;
import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class HosTypeDAOImp implements IHosTypeDAO {
	private HosTypeDAOImp(){
	}
	
	public static HosTypeDAOImp getInstance(){
		return new HosTypeDAOImp();
	}
	public List<HosType> selectAll() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from HosType";
		Query query = session.createQuery(hsql);
		List<HosType> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}

}

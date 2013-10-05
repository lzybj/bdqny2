package com.bdqn.hibernate.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.dao.IHosDistrictDAO;
import com.bdqn.hibernate.domain.HosDistrict;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class HosDistrictDAOImp implements IHosDistrictDAO {
	private HosDistrictDAOImp(){
	}
	public static HosDistrictDAOImp getInstance(){
		return new HosDistrictDAOImp();
	}
	
	public List<HosDistrict> selectAll() {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from HosDistrict";
		Query query = session.createQuery(hsql);
		List<HosDistrict> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}

}

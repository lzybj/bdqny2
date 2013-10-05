package com.bdqn.hibernate.dao.imp;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.dao.IHosStreetDAO;
import com.bdqn.hibernate.domain.HosStreet;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class HosStreetDAOImp implements IHosStreetDAO {
	private HosStreetDAOImp(){
	}
	public static HosStreetDAOImp getInstance(){
		return new HosStreetDAOImp();
	}
	
	public List<HosStreet> selectByDid(String did) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select new com.bdqn.hibernate.domain.HosStreet(hs.sid,hs.sname) " +
				"from HosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"where hd.did = ?";
		Query query = session.createQuery(hsql);
		query.setBigDecimal(0,new BigDecimal(did));
		List<HosStreet> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}

}

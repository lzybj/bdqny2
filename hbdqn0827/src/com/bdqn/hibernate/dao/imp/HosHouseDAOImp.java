package com.bdqn.hibernate.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.dao.IHosHouseDAO;
import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.res.HosResObject;

public class HosHouseDAOImp implements IHosHouseDAO {
	
	private HosHouseDAOImp(){
	}
	
	public static HosHouseDAOImp getInstance(){
		return new HosHouseDAOImp();
	}

	public List<HosResObject> selectParam(String selParam, String orderBy) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select new com.bdqn.hibernate.res.HosResObject" +
				"(" +
				"hd.dname,hs.sname,ht.htname,hh.price,su.uname,hh.htime" +
				") " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"inner join hh.hosType ht " +
				"inner join hh.sysUser su " +
				"where 1 = 1 " + selParam + " " + orderBy;
		Query query = session.createQuery(hsql);
		List<HosResObject> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}

}

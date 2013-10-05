package com.bdqn.hibernate.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.dao.IHosHouseDAO;
import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.res.HosResObj;

public class HosHouseDAOImp implements IHosHouseDAO {
	private HosHouseDAOImp(){
	}
	public static HosHouseDAOImp getInstance(){
		return new HosHouseDAOImp();
	}
	public List<HosResObj> selectMyParam(String param,String orderby) {
		// TODO Auto-generated method stub
		String hsql = "select new com.bdqn.hibernate.res.HosResObj(" +
				"hd.dname,hs.sname,ht.htname,hh.price,su.uname,hh.htime) " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"inner join hh.hosType ht " +
				"inner join hh.sysUser su " +
				"where 1=1 " + param + " " +
						"order by " + orderby;
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		List<HosResObj> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}

}

package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.res.HosResObj2;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hsql = "select new com.bdqn.hibernate.res.HosResObj2" +
				"(ht.htname,su.uname,hd.dname,hs.sname) " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"inner join hh.hosType ht " +
				"inner join hh.sysUser su " +
				"where hd.did in (" + 
			     "select hd.did " +
				"from HosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"group by hd.did " +
				"having count(hs) > 1)";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		List<HosResObj2> data = query.list();
		for (HosResObj2 hosResObj2 : data) {
			System.out.println(hosResObj2.getHtname()
					+ "," + hosResObj2.getUname()
					+ "," + hosResObj2.getDname()
					+ "," + hosResObj2.getSname());
		}
//		List<Object> data = query.list();
//		for (Object object : data) {
//			System.out.println(object);
//		}
		HibernateSessionFactory.closeSession();
	}

}

package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hsql = "select su.uname " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"inner join hh.hosType ht " +
				"inner join hh.sysUser su " +
				"where hd.dname = ? and hh.price = (" +
				"select min(hh.price) " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"where hd.dname = ?)";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setString(0,"海淀区");
		query.setString(1,"海淀区");
		List<Object> data = query.list();
		for (Object object : data) {
			System.out.println(object);
		}
		HibernateSessionFactory.closeSession();
	}

}

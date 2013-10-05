package com.bdqn.hibernate.test;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select max(hh.price),min(hh.price) " +
				"from HosHouse hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"where hd.dname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"海淀区");
		Object[] obj = (Object[])query.uniqueResult();
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		HibernateSessionFactory.closeSession();
	}

}

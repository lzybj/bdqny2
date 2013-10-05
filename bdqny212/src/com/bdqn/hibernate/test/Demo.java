package com.bdqn.hibernate.test;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select sum(h.price) " +
				"from HosHouse h";
		hsql = "select avg(h.price) " +
				"from HosHouse h";
		Query query = session.createQuery(hsql);
		Object obj = query.uniqueResult();
		System.out.println(obj);
		HibernateSessionFactory.closeSession();
	}

}

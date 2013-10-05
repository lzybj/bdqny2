package com.bdqn.hibernate.test;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select max(hh.price),min(hh.price) " +
				"from HosHouse hh";
		Query query = session.createQuery(hsql);
		Object[] objs = (Object[])query.uniqueResult();
		System.out.println(objs[0]);
		System.out.println(objs[1]);
		HibernateSessionFactory.closeSession();
	}

}

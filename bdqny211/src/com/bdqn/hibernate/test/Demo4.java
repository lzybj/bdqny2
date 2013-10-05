package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select count(tx) " +
				"from TblTxl tx";
		Query query = session.createQuery(hsql);
		Object obj = query.uniqueResult();
		System.out.println(obj);
		HibernateSessionFactory.closeSession();
	}

}

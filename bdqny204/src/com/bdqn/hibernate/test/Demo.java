package com.bdqn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.HtUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		HtUsers myuser = new HtUsers("laoli","123456");
		session.save(myuser);
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

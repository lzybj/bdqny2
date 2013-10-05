package com.bdqn.hibernate.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.hygj.security.MD5;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		String hsql = "update from HtUsers u set u.upwd = ? where u.uname = ?";
		Query query = session.createQuery(hsql);
		MD5 md = new MD5();
		query.setString(0,md.getMD5ofStr("qaz123"));
		query.setString(1,"laozheng");
		System.out.println(query.executeUpdate());
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

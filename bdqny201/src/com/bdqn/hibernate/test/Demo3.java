package com.bdqn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.HtUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		//查询
		HtUsers myuser = (HtUsers)session.load(HtUsers.class,"21");
		//update
		myuser.setUname("laowang");
		//HtUsers myuser = (HtUsers)session.get(HtUsers.class,"1231");		
//		System.out.println(myuser.getUname());
//		System.out.println(myuser.getUpwd());
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

package com.bdqn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.HtUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HtUsers myUser = new HtUsers("laochen","123456");//瞬时态
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		HtUsers myUser = new HtUsers("laochen","123456");//瞬时态
		session.save(myUser);//持久态
		myUser.setUname("laozheng");//持久态
		System.out.println(myUser.getUname());
		session.delete(myUser);//删除
		t.commit();
		HibernateSessionFactory.closeSession();
		myUser.setUname("laoli");//游离态
	}

}

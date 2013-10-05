package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.Product;
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
		Product p = new Product("62T9563F",new BigDecimal(2),"网卡","天津",new BigDecimal(650), new Date(2008-1900,9,25));
		session.save(p);
		
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

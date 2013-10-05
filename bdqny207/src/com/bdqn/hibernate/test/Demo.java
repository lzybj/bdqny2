package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.Product;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Session session = HibernateSessionFactory.getSession();
//		Transaction t = session.beginTransaction();
//		t.begin();
//		Date intime = new Date(2008-1900,9,25);
//		Product mypro = new Product(new Integer(1),"北大青鸟CDMA无线上网卡","62T9562F","天津",new BigDecimal(650),intime);
//		session.save(mypro);
//		t.commit();
//		HibernateSessionFactory.closeSession();
	}

}

package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		String hsql = "update from Product p set p.xname = ?,p.ftime = ?,p.fprice = ?,p.bxtime = ?,p.content = ? where p.bianma = ? ";
		Query query = session.createQuery(hsql);
		query.setString(0,"北京");
		query.setDate(1,new Date(2008-1900,10,2));
		query.setBigDecimal(2, new BigDecimal(730));
		query.setDate(3,new Date(2018-1900,10,2));
		query.setString(4,"附录！");
		query.setInteger(5,1);
		System.out.println(query.executeUpdate());
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

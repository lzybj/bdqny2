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
		String hsql = "select tx.txtel" +
				" from TblUsers u " +
				" inner join u.tblTxls tx " +
				" where u.uname = ? and tx.txname = ?";
		hsql = "select tx.txtel" +
				" from TblTxl tx " +
				" inner join tx.tblUsers u " +
				" where u.uname = ? and tx.txname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"老郑");
		query.setString(1,"马吉宁");
		Object obj = query.uniqueResult();
		System.out.println(obj);
		HibernateSessionFactory.closeSession();
	}

}

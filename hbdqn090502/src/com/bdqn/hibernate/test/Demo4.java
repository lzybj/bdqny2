package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String sql = "select u.uname uname,tx.txname txname from tbl_users u " +
				"inner join tbl_txl tx " +
				"on tx.usid = u.usid " +
				"where u.uname = ?";
		SQLQuery query = session.createSQLQuery(sql);
		query.setString(0,"¿œ÷£");
		query.addScalar("uname",Hibernate.STRING);
		query.addScalar("txname",Hibernate.STRING);
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0] + "," + objects[1]);
		}
		
		HibernateSessionFactory.closeSession();
	}

}

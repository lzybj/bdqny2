package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select u.uname,count(tx) " +
				"from TblTxl tx " +
				"inner join tx.tblUsers u " +
				"group by u.uname " +
				"having count(tx) > 2";
		Query query = session.createQuery(hsql);
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
		HibernateSessionFactory.closeSession();
	}

}

package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hsql = "select ht.htname,count(hh) " +
				"from HosType ht " +
				"inner join ht.hosHouses hh " +
				"inner join hh.hosStreet hs " +
				"inner join hs.hosDistrict hd " +
				"where hd.dname = ? " +
				"group by ht.htname ";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setString(0,"º£µíÇø");
		List<Object[]> data = query.list();
		for (Object[] objects : data) {
			System.out.println(objects[0] + "," + objects[1]);
		}
		HibernateSessionFactory.closeSession();
	}

}

package com.bdqn.hibernate.test;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from TblUsers u where u.uname = ?";
		Query query = session.createQuery(hsql);
//		Query query = session.createQuery(hsql).setCacheable(true);
		query.setString(0,"¿œ÷£");
		List<TblUsers> data = query.list();
//		Iterator<TblUsers> data = query.iterate();
		for (TblUsers tblUsers : data) {
			System.out.println(tblUsers.getUname());
		}
//		while (data.hasNext()) {
//			TblUsers myuser = data.next();
//			System.out.println(myuser.getUname());
//		}
		HibernateSessionFactory.closeSession();
		Session session2 = HibernateSessionFactory.getSession();
		Query query2 = session2.createQuery(hsql);
//		Query query2 = session2.createQuery(hsql).setCacheable(true);
		query2.setString(0, "¿œ÷£");
//		List<TblUsers> data2 = query2.list();
		Iterator<TblUsers> data2 = query2.iterate();
//		for (TblUsers tblUsers : data2) {
//			System.out.println(tblUsers.getUname());
//		}
		while (data2.hasNext()) {
			TblUsers myuser = data2.next();
			System.out.println(myuser.getUname());
		}
		HibernateSessionFactory.closeSession();
	}

}

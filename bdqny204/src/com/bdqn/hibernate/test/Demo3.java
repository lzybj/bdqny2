package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HtUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.resobj.MyUsers;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select u.htid,u.upwd from HtUsers u";
		hsql = "select new com.bdqn.hibernate.domain.HtUsers(u.upwd) from HtUsers u";
		hsql = "select new com.bdqn.hibernate.resobj.MyUsers(u.htid,u.upwd) from HtUsers u";
		Query query = session.createQuery(hsql);
		
		List<MyUsers> data = query.list();
		
		for (MyUsers myUsers : data) {
			System.out.println(myUsers.getHtid());
			System.out.println(myUsers.getUpwd());
		}
		
//		List<HtUsers> data = query.list();
//		for (HtUsers htUsers : data) {
//			System.out.println(htUsers.getUpwd());
//		}
//		
//		List<Object[]> pwds = query.list();
//		
//		for (Object[] objects : pwds) {
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//		}
//		for (Object object : pwds) {
//			System.out.println(object);
//		}
		
		
		
		HibernateSessionFactory.closeSession();
	}

}

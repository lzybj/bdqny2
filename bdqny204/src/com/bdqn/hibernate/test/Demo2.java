package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.HtUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hql = "from HtUsers";
		hql = "from HtUsers u where u.uname = ?";
		Query query = session.createQuery(hql);
		query.setString(0,"laoli");
		HtUsers myuser = (HtUsers)query.uniqueResult();
		System.out.println(myuser.getUpwd());
//		List<HtUsers> data = query.list();
//		for (HtUsers htUsers : data) {
//			System.out.println(htUsers.getHtid());
//			System.out.println(htUsers.getUname());
//			System.out.println(htUsers.getUpwd());
//		}
		
		HibernateSessionFactory.closeSession();
	}

}

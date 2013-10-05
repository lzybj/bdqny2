package com.bdqn.hibernate.test;

import java.math.BigDecimal;

import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 一级缓存是Session级别的缓存，支持load/get 方式的查询，同时不能够跨Session
		 * 并且，一级缓存不可配置
		 */
		Session session = HibernateSessionFactory.getSession();
		TblUsers myuser = (TblUsers)session.get(TblUsers.class,new BigDecimal(100));
		System.out.println(myuser.getUname());
		HibernateSessionFactory.closeSession();
		Session session2 = HibernateSessionFactory.getSession();
		TblUsers myuser2 = (TblUsers)session2.get(TblUsers.class,new BigDecimal(100));
		System.out.println(myuser2.getUname());
		HibernateSessionFactory.closeSession();
	}

}

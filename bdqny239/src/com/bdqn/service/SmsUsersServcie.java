package com.bdqn.service;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.SmsUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class SmsUsersServcie {
	public SmsUsers login(String uname,String upwd){
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from SmsUsers su where su.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,uname);
		SmsUsers su = (SmsUsers)query.uniqueResult();
		HibernateSessionFactory.closeSession();
		if(su != null){
			if(su.getUpwd().equals(upwd)){
				return su;
			}
		}
		return null;
	}
}

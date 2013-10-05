package com.bdqn.hibernate.service;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.Userinfo;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class UserInfoService {
	private Session session = null;
	private Query query = null;
	private String hsql = "";
	public Userinfo findByUserid(String userid){
		session = HibernateSessionFactory.getSession();
		hsql = "from Userinfo u where u.userid = ?";
		query = session.createQuery(hsql);
		query.setString(0,userid);
		Userinfo myuser = (Userinfo)query.uniqueResult();
		HibernateSessionFactory.closeSession();
		return myuser;
	}
}

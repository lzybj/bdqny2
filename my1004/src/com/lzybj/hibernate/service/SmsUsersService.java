package com.lzybj.hibernate.service;

import org.hibernate.Query;
import org.hibernate.Session;

import com.lzybj.hibernate.domain.SmsUsers;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

public class SmsUsersService {
	public SmsUsers login(String uname,String upwd){
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from SmsUsers su where su.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,uname);
		SmsUsers su = (SmsUsers)query.uniqueResult();
		HibernateSessionFactory.closeSession();
		return su;
	}
	public static void main(String[] args) {
		SmsUsersService sus = new SmsUsersService();
		System.out.println(sus.login("ilyj","qaz123").getUpwd());
	}
}

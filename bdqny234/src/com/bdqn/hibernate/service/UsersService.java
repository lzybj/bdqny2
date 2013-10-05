package com.bdqn.hibernate.service;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.SysUser;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class UsersService {
	public boolean login(String userName,String passWord){
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from SysUser su where su.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,userName);
		SysUser myUser = (SysUser)query.uniqueResult();
		HibernateSessionFactory.closeSession();
		if(myUser != null){
			if(myUser.getUpassword().equals(passWord)){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		UsersService us = new UsersService();
		System.out.println(us.login("xxx0","sfsdfsd"));
	}
}

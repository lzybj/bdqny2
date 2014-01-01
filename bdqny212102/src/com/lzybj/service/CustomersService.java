package com.lzybj.service;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lzybj.hibernate.domain.Customers;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

public class CustomersService {
	public Customers isLogin(String cname,String cpwd){
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from Customers c where c.cname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,cname);
		Customers c = (Customers)query.uniqueResult();
		if(c.getCpwd().equals(cpwd)){
			HibernateSessionFactory.closeSession();
			return c;
		}
		HibernateSessionFactory.closeSession();
		return null;
	}
	public boolean addCustomer(String cname,String cpwd){
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		session.save(new Customers(cname, cpwd));
		t.commit();
		HibernateSessionFactory.closeSession();
		return true;
	}
}

package com.bdqn.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.Diaocha;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class DiaoChaService {
	public boolean addResult(Diaocha pardc){
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		session.save(pardc);
		t.commit();
		HibernateSessionFactory.closeSession();
		return true;
	}
}

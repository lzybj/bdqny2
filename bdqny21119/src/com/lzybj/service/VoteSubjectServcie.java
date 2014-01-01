package com.lzybj.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.lzybj.hibernate.domain.VoteSubject;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

public class VoteSubjectServcie {
	public List<VoteSubject> findByAll(){
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery("from VoteSubject");
		List<VoteSubject> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}
	
	public VoteSubject findByVsId(String vsid){
		Session session = HibernateSessionFactory.getSession();
		VoteSubject vs = (VoteSubject)session.get(VoteSubject.class,new Integer(vsid));
		HibernateSessionFactory.closeSession();
		return vs;
	}
}

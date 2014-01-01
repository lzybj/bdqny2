package com.lzybj.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.lzybj.hibernate.domain.VoteOption;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

public class VoteUserService {
	public int findByVsidUserCount(String vsid){
		String hsql = "select count(vi) from VoteItem vi where vi.voteSubject.vsId = ?";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setInteger(0,new Integer(vsid));
		int sum = ((Long)query.uniqueResult()).intValue();
		HibernateSessionFactory.closeSession();		
		return sum;
	}
}

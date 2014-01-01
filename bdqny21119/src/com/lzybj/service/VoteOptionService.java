package com.lzybj.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.lzybj.hibernate.domain.VoteOption;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

public class VoteOptionService {
	public List<VoteOption> findByVsid(String vsid){
		String hsql = "from VoteOption vo where vo.voteSubject.vsId = ? order by vo.voOrder asc";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setInteger(0,new Integer(vsid));
		List<VoteOption> vos = query.list();
		HibernateSessionFactory.closeSession();
		return vos;
	}
	
	public VoteOption findByVoid(String voids){
		Session session = HibernateSessionFactory.getSession();
		VoteOption vop = (VoteOption)session.get(VoteOption.class,new Integer(voids));
		HibernateSessionFactory.closeSession();
		return vop;
	}
	
	public static void main(String[] args) {
		VoteOptionService vos = new VoteOptionService();
		List<VoteOption> vv = vos.findByVsid("1");
		for (VoteOption voteOption : vv) {
			System.out.println(voteOption.getVoOption());
		}
	}
}

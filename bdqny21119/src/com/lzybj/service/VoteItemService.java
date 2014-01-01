package com.lzybj.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lzybj.hibernate.domain.VoteItem;
import com.lzybj.hibernate.domain.VoteOption;
import com.lzybj.hibernate.domain.VoteSubject;
import com.lzybj.hibernate.domain.VoteUser;
import com.lzybj.hibernate.factory.HibernateSessionFactory;
import com.lzybj.hibernate.resobj.VoteTotalObj;

public class VoteItemService {
	public List<VoteTotalObj> totalByVsid(String vsid){
		String hsql = "select new com.lzybj.hibernate.resobj.VoteTotalObj" +
				"(vitem.voteOption,count(vitem))" +
				" from VoteItem vitem" +
				" where vitem.voteSubject.vsId = ?" +
				" group by vitem.voteOption";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setInteger(0,new Integer(vsid));
		List<VoteTotalObj> data = query.list();
		HibernateSessionFactory.closeSession();
		int sum = 0;
		for (VoteTotalObj voteTotalObj : data) {
			sum = sum + voteTotalObj.getNum().intValue();
		}
		for (VoteTotalObj voteTotalObj : data) {
			voteTotalObj.setSum(sum);
		}
		return data;
	}
	
	public boolean submitvote(String[] vsops,VoteUser vu){
		/**
		 * 1.根据选项数组ID，遍历
		 */
		VoteOptionService voptionSerivce = new VoteOptionService();
		List<VoteOption> voteops = new ArrayList<VoteOption>();
		for (String vpid : vsops) {
			voteops.add(voptionSerivce.findByVoid(vpid));
		}
		/**
		 * 2.获得内容对象
		 */
		VoteSubject votesub = voteops.get(0).getVoteSubject();
		/**
		 * 3.插入数据
		 */
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		for (VoteOption voteOption : voteops) {
			session.save(new VoteItem(voteOption, vu, votesub));
		}
		t.commit();
		HibernateSessionFactory.closeSession();
		return true;
	}
	public static void main(String[] args) {
		VoteItemService vis = new VoteItemService();
//		VoteUser vu = new VoteUser(new Integer(1),"lzybj","qaz123");
//		String[] strs = {"1","2"};
//		vis.submitvote(strs, vu);
		List<VoteTotalObj> data = vis.totalByVsid("1");
		for (VoteTotalObj voteTotalObj : data) {
			System.out.println(voteTotalObj.getVoteOption().getVoOption() + "-------" + voteTotalObj.getNum() + "-------" + voteTotalObj.getNumlv());
		}
	}
}

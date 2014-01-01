package com.lzybj.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.VoteUser;

public class VoteUserService extends HibernateDaoSupport{
	public boolean addVu(String uname,String upwd){
		this.getHibernateTemplate().save(new VoteUser(uname, upwd));
		return true;
	}
	
	public List<VoteUser> findByAll(){
		List<VoteUser> data = this.getHibernateTemplate().find("from VoteUser");
		return data;
	}
	
	public List<VoteUser> findByVuUsername(String uname){
		String hsql = "from VoteUser vu where vu.vuUserName like ?";
		List<VoteUser> data = this.getHibernateTemplate().find(hsql,"%" + uname + "%");
		return data;
	}
	
	public boolean findByUnameForUpdate(String uname,String newupwd){
		String hsql = "update from VoteUser vu set vu.vuPassword = ? where vu.vuUserName = ?";
		this.getHibernateTemplate().bulkUpdate(hsql,newupwd,uname);
		return true;
	}
	
	
}

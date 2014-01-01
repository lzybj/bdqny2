package com.lzybj.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.Lxrs;
import com.lzybj.hibernate.domain.Users;

public class LxrsService extends HibernateDaoSupport{
	public boolean addLxr(Users myuser,Lxrs mylxr){
		mylxr.setUsers(myuser);
		this.getHibernateTemplate().save(mylxr);
		return true;
	}
	
	public List<Lxrs> findByLxrName(Users myuser,String lxrname){
		String hsql = "from Lxrs lx where lx.lxrname like ? and lx.users.uid = ?";
		List<Lxrs> data = this.getHibernateTemplate().find(hsql,"%"+lxrname+"%",myuser.getUid());
		return data;
	}
	
}

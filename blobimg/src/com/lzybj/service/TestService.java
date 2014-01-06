package com.lzybj.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.Test;

public class TestService extends HibernateDaoSupport{
	public boolean addImg(Test img){
		this.getHibernateTemplate().save(img);
		return true;
	}
	public List<Test> findByAll(){
		return this.getHibernateTemplate().find("from Test");
	}
	public Test findByTid(String tid){
		return this.getHibernateTemplate().get(Test.class,Integer.parseInt(tid));
	}
}

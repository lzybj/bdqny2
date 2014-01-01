package com.lzybj.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.SysDictionary;

public class SysDictionaryService extends HibernateDaoSupport{
	public List<SysDictionary> findByAll(){
		String hsql = "from SysDictionary";
		List<SysDictionary> data = this.getHibernateTemplate().find(hsql);
		return data;
	}
	
	public SysDictionary findByItemid(String itemid){
		SysDictionary item = this.getHibernateTemplate().get(SysDictionary.class,new Integer(itemid));
		return item;
	}
	
}

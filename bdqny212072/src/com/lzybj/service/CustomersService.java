package com.lzybj.service;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.Customers;

public class CustomersService extends HibernateDaoSupport{
	
	public Customers findByCusid(String cusid){
		return this.getHibernateTemplate().get(Customers.class,new Integer(cusid));
	}
}

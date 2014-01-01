package com.lzybj.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.Customers;

public class CustomersService extends HibernateDaoSupport{
	public List<Customers> findByAll(){
		String hql = "from Customers";
		List<Customers> data = this.getHibernateTemplate().find(hql);
		return data;
	}
	
	public Customers findByCustid(String custid){
		Customers c = this.getHibernateTemplate().get(Customers.class,new Integer(custid));
		return c;
	}
	
}

package com.lzybj.service;

import java.util.List;

import org.apache.struts.action.DynaActionForm;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.Customers;

public class CustomersService extends HibernateDaoSupport{
	public List<Customers> findByCname(String cname){
		String hsql = "from Customers c where c.cname like ?";
		List<Customers> data = this.getHibernateTemplate().find(hsql,"%"+ cname +"%");
		return data;
	}
	
	public Customers isLogin(String cname,String cpwd){
		String hsql = "from Customers c where cname = ?";
		List<Customers> data = this.getHibernateTemplate().find(hsql, cname);
		if(data.size() != 0){
			Customers c = data.get(0);
			if(c.getCpwd().equals(cpwd)){
				return c;
			}
		}
		return null;
	}
	public boolean register(String cname,String cpwd){
		this.getHibernateTemplate().save(new Customers(cname, cpwd));
		return true;
	}
	
}

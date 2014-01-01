package com.lzybj.service;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.Products;

public class ProductsService extends HibernateDaoSupport{
	public List<Products> findByAll(){
		String hsql = "from Products";
		List<Products> data = this.getHibernateTemplate().find(hsql);
		return data;
	}
	
	public Products findByProdid(String prodid){
		Products p = this.getHibernateTemplate().get(Products.class,new Integer(prodid));
		return p;
	}
	
}

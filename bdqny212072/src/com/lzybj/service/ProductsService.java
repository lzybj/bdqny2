package com.lzybj.service;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.Products;

public class ProductsService extends HibernateDaoSupport{
	public Products findByProdid(String prodid){
		return this.getHibernateTemplate().get(Products.class,new Integer(prodid));
	}
}

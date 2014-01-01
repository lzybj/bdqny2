package com.lzybj.service;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.lzybj.hibernate.domain.Orders;

@Transactional
public class OrdersService extends HibernateDaoSupport{
	@Transactional(readOnly=false,noRollbackFor=Exception.class)
	public boolean addOrder(Orders myorder){
		this.getHibernateTemplate().save(myorder);
		return true;
	}
}

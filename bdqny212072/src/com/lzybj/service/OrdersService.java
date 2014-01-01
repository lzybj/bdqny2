package com.lzybj.service;

import java.math.BigDecimal;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.lzybj.hibernate.domain.Customers;
import com.lzybj.hibernate.domain.Orderdetails;
import com.lzybj.hibernate.domain.Orders;
import com.lzybj.hibernate.domain.Products;

public class OrdersService extends HibernateDaoSupport{
	private CustomersService cs = null;
	private ProductsService ps = null;
	
	
	
	public CustomersService getCs() {
		return cs;
	}



	public void setCs(CustomersService cs) {
		this.cs = cs;
	}



	public ProductsService getPs() {
		return ps;
	}



	public void setPs(ProductsService ps) {
		this.ps = ps;
	}



	public boolean addOrders(){
		Customers c = cs.findByCusid("2");
		Orders myorder = new Orders(c,"陈浩","济南泺源大街","OK");
		Products p = ps.findByProdid("2");
		Orderdetails ods = new Orderdetails(myorder,p,new BigDecimal(10));
		myorder.getOrderdetailses().add(ods);
		this.getHibernateTemplate().save(myorder);
		return true;
	}

	@Transactional(readOnly=false,rollbackFor=Exception.class)
	public boolean addOrders2(){
		Customers c = cs.findByCusid("2");
		Orders myorder = new Orders(c,"陈浩","济南泺源大街","OK");
		Products p = ps.findByProdid("2");
		Orderdetails ods = new Orderdetails(myorder,p,new BigDecimal(10));
		this.getHibernateTemplate().save(myorder);
		this.getHibernateTemplate().save(ods);
		return true;
	}
	
	
}

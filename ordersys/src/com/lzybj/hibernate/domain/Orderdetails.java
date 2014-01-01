package com.lzybj.hibernate.domain;

import java.math.BigDecimal;

/**
 * Orderdetails entity. @author MyEclipse Persistence Tools
 */

public class Orderdetails implements java.io.Serializable {

	// Fields

	private Integer odid;
	private Orders orders;
	private Products products;
	private BigDecimal odprodcount;
	private double total;
	
	

	// Constructors

	public double getTotal() {
		total = products.getProdprice() * odprodcount.doubleValue();
		return total;
	}

	/** default constructor */
	public Orderdetails() {
	}

	/** full constructor */
	public Orderdetails(Orders orders, Products products, BigDecimal odprodcount) {
		this.orders = orders;
		this.products = products;
		this.odprodcount = odprodcount;
	}
	
	// Property accessors

	public Integer getOdid() {
		return this.odid;
	}

	public void setOdid(Integer odid) {
		this.odid = odid;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public BigDecimal getOdprodcount() {
		return this.odprodcount;
	}

	public void setOdprodcount(BigDecimal odprodcount) {
		this.odprodcount = odprodcount;
	}

}
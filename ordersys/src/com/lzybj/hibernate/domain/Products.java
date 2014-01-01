package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Products entity. @author MyEclipse Persistence Tools
 */

public class Products implements java.io.Serializable {

	// Fields

	private Integer prodid;
	private String prodname;
	private Double prodprice;
	private Set orderdetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Products() {
	}

	/** minimal constructor */
	public Products(String prodname, Double prodprice) {
		this.prodname = prodname;
		this.prodprice = prodprice;
	}

	/** full constructor */
	public Products(String prodname, Double prodprice, Set orderdetailses) {
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.orderdetailses = orderdetailses;
	}

	// Property accessors

	public Integer getProdid() {
		return this.prodid;
	}

	public void setProdid(Integer prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return this.prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public Double getProdprice() {
		return this.prodprice;
	}

	public void setProdprice(Double prodprice) {
		this.prodprice = prodprice;
	}

	public Set getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

}
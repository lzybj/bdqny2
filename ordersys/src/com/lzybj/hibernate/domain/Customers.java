package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Customers entity. @author MyEclipse Persistence Tools
 */

public class Customers implements java.io.Serializable {

	// Fields

	private Integer cusid;
	private String cusname;
	private String cusaddr;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customers() {
	}

	/** minimal constructor */
	public Customers(String cusname, String cusaddr) {
		this.cusname = cusname;
		this.cusaddr = cusaddr;
	}

	/** full constructor */
	public Customers(String cusname, String cusaddr, Set orderses) {
		this.cusname = cusname;
		this.cusaddr = cusaddr;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getCusid() {
		return this.cusid;
	}

	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}

	public String getCusname() {
		return this.cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public String getCusaddr() {
		return this.cusaddr;
	}

	public void setCusaddr(String cusaddr) {
		this.cusaddr = cusaddr;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}
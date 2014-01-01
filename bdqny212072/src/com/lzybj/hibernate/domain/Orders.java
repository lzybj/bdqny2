package com.lzybj.hibernate.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer ordid;
	private Customers customers;
	private String orddelivername;
	private String orddeliveraddr;
	private Timestamp ordorderdate;
	private Timestamp orddeliverdate;
	private String ordstatus;
	private Set orderdetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Customers customers, String orddelivername,
			String orddeliveraddr, Timestamp ordorderdate, String ordstatus) {
		this.customers = customers;
		this.orddelivername = orddelivername;
		this.orddeliveraddr = orddeliveraddr;
		this.ordorderdate = ordorderdate;
		this.ordstatus = ordstatus;
	}
	
	

	public Orders(Customers customers, String orddelivername,
			String orddeliveraddr, String ordstatus) {
		super();
		this.customers = customers;
		this.orddelivername = orddelivername;
		this.orddeliveraddr = orddeliveraddr;
		this.ordstatus = ordstatus;
	}

	/** full constructor */
	public Orders(Customers customers, String orddelivername,
			String orddeliveraddr, Timestamp ordorderdate,
			Timestamp orddeliverdate, String ordstatus, Set orderdetailses) {
		this.customers = customers;
		this.orddelivername = orddelivername;
		this.orddeliveraddr = orddeliveraddr;
		this.ordorderdate = ordorderdate;
		this.orddeliverdate = orddeliverdate;
		this.ordstatus = ordstatus;
		this.orderdetailses = orderdetailses;
	}

	// Property accessors

	public Integer getOrdid() {
		return this.ordid;
	}

	public void setOrdid(Integer ordid) {
		this.ordid = ordid;
	}

	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public String getOrddelivername() {
		return this.orddelivername;
	}

	public void setOrddelivername(String orddelivername) {
		this.orddelivername = orddelivername;
	}

	public String getOrddeliveraddr() {
		return this.orddeliveraddr;
	}

	public void setOrddeliveraddr(String orddeliveraddr) {
		this.orddeliveraddr = orddeliveraddr;
	}

	public Timestamp getOrdorderdate() {
		return this.ordorderdate;
	}

	public void setOrdorderdate(Timestamp ordorderdate) {
		this.ordorderdate = ordorderdate;
	}

	public Timestamp getOrddeliverdate() {
		return this.orddeliverdate;
	}

	public void setOrddeliverdate(Timestamp orddeliverdate) {
		this.orddeliverdate = orddeliverdate;
	}

	public String getOrdstatus() {
		return this.ordstatus;
	}

	public void setOrdstatus(String ordstatus) {
		this.ordstatus = ordstatus;
	}

	public Set getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

}
package com.bdqn.hibernate.domain;

import java.math.BigDecimal;

/**
 * HtUsers entity. @author MyEclipse Persistence Tools
 */

public class HtUsers implements java.io.Serializable {

	// Fields

	private BigDecimal htid;
	private String uname;
	private String upwd;

	// Constructors

	/** default constructor */
	public HtUsers() {
	}

	/** full constructor */
	public HtUsers(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}

	// Property accessors

	public BigDecimal getHtid() {
		return this.htid;
	}

	public void setHtid(BigDecimal htid) {
		this.htid = htid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

}
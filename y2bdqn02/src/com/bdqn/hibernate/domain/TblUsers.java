package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TblUsers entity. @author MyEclipse Persistence Tools
 */

public class TblUsers implements java.io.Serializable {

	// Fields

	private String usid;
	private String uname;
	private String upwd;

	// Constructors

	/** default constructor */
	public TblUsers() {
	}

	/** minimal constructor */
	public TblUsers(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}


	// Property accessors

	public String getUsid() {
		return this.usid;
	}

	public void setUsid(String usid) {
		this.usid = usid;
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
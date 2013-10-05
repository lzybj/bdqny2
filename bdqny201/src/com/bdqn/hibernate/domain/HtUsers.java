package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * HtUsers entity. @author MyEclipse Persistence Tools
 */

public class HtUsers implements java.io.Serializable {

	// Fields

	private String htid;
	private String uname;
	private String upwd;
	private Date ctime;

	// Constructors

	/** default constructor */
	public HtUsers() {
	}

	/** minimal constructor */
	public HtUsers(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}

	/** full constructor */
	public HtUsers(String uname, String upwd, Date ctime) {
		this.uname = uname;
		this.upwd = upwd;
		this.ctime = ctime;
	}

	// Property accessors

	public String getHtid() {
		return this.htid;
	}

	public void setHtid(String htid) {
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

	public Date getCtime() {
		return this.ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

}
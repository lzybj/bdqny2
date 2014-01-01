package com.lzybj.hibernate.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * SysUser entity. @author MyEclipse Persistence Tools
 */

public class SysUser implements java.io.Serializable {

	// Fields

	private BigDecimal usid;
	private String uname;
	private String upassword;
	private Set hosHouses = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysUser() {
	}

	/** minimal constructor */
	public SysUser(String uname, String upassword) {
		this.uname = uname;
		this.upassword = upassword;
	}

	/** full constructor */
	public SysUser(String uname, String upassword, Set hosHouses) {
		this.uname = uname;
		this.upassword = upassword;
		this.hosHouses = hosHouses;
	}

	// Property accessors

	public BigDecimal getUsid() {
		return this.usid;
	}

	public void setUsid(BigDecimal usid) {
		this.usid = usid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return this.upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public Set getHosHouses() {
		return this.hosHouses;
	}

	public void setHosHouses(Set hosHouses) {
		this.hosHouses = hosHouses;
	}

}
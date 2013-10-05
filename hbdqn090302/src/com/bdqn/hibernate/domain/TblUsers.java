package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TblUsers entity. @author MyEclipse Persistence Tools
 */

public class TblUsers implements java.io.Serializable {

	// Fields

	private BigDecimal usid;
	private String uname;
	private String upwd;
	private Set tblTxls = new HashSet(0);

	// Constructors

	/** default constructor */
	public TblUsers() {
	}

	/** minimal constructor */
	public TblUsers(String uname, String upwd) {
		this.uname = uname;
		this.upwd = upwd;
	}

	/** full constructor */
	public TblUsers(String uname, String upwd, Set tblTxls) {
		this.uname = uname;
		this.upwd = upwd;
		this.tblTxls = tblTxls;
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

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Set getTblTxls() {
		return this.tblTxls;
	}

	public void setTblTxls(Set tblTxls) {
		this.tblTxls = tblTxls;
	}

}
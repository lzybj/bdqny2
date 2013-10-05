package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TblTxl entity. @author MyEclipse Persistence Tools
 */

public class TblTxl implements java.io.Serializable {

	// Fields

	private BigDecimal tid;
	private TblUsers tblUsers;
	private String txname;
	private String txtel;
	private Date ctime;

	// Constructors

	/** default constructor */
	public TblTxl() {
	}

	/** minimal constructor */
	public TblTxl(String txname, String txtel, Date ctime) {
		this.txname = txname;
		this.txtel = txtel;
		this.ctime = ctime;
	}

	/** full constructor */
	public TblTxl(TblUsers tblUsers, String txname, String txtel, Date ctime) {
		this.tblUsers = tblUsers;
		this.txname = txname;
		this.txtel = txtel;
		this.ctime = ctime;
	}

	// Property accessors

	public BigDecimal getTid() {
		return this.tid;
	}

	public void setTid(BigDecimal tid) {
		this.tid = tid;
	}

	public TblUsers getTblUsers() {
		return this.tblUsers;
	}

	public void setTblUsers(TblUsers tblUsers) {
		this.tblUsers = tblUsers;
	}

	public String getTxname() {
		return this.txname;
	}

	public void setTxname(String txname) {
		this.txname = txname;
	}

	public String getTxtel() {
		return this.txtel;
	}

	public void setTxtel(String txtel) {
		this.txtel = txtel;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

}
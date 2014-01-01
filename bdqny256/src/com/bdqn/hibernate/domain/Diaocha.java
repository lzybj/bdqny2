package com.bdqn.hibernate.domain;

import java.sql.Timestamp;

/**
 * Diaocha entity. @author MyEclipse Persistence Tools
 */

public class Diaocha implements java.io.Serializable {

	// Fields

	private Integer tid;
	private String uname;
	private String ahlist;
	private Timestamp ctime;

	// Constructors

	/** default constructor */
	public Diaocha() {
	}

	/** full constructor */
	public Diaocha(String uname, String ahlist, Timestamp ctime) {
		this.uname = uname;
		this.ahlist = ahlist;
		this.ctime = ctime;
	}
	
	

	public Diaocha(String uname, String ahlist) {
		super();
		this.uname = uname;
		this.ahlist = ahlist;
	}

	public Diaocha(String ahlist) {
		super();
		this.ahlist = ahlist;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getAhlist() {
		return this.ahlist;
	}

	public void setAhlist(String ahlist) {
		this.ahlist = ahlist;
	}

	public Timestamp getCtime() {
		return this.ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}

}
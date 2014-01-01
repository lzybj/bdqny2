package com.lzybj.hibernate.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private String upwd;
	private Timestamp regtime;
	private Set lxrses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(String uname, String upwd, Timestamp regtime) {
		this.uname = uname;
		this.upwd = upwd;
		this.regtime = regtime;
	}

	/** full constructor */
	public Users(String uname, String upwd, Timestamp regtime, Set lxrses) {
		this.uname = uname;
		this.upwd = upwd;
		this.regtime = regtime;
		this.lxrses = lxrses;
	}
	
	

	public Users(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
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

	public Timestamp getRegtime() {
		return this.regtime;
	}

	public void setRegtime(Timestamp regtime) {
		this.regtime = regtime;
	}

	public Set getLxrses() {
		return this.lxrses;
	}

	public void setLxrses(Set lxrses) {
		this.lxrses = lxrses;
	}

}
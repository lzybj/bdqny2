package com.lzybj.hibernate.domain;

/**
 * Lxrs entity. @author MyEclipse Persistence Tools
 */

public class Lxrs implements java.io.Serializable {

	// Fields

	private Integer lxrid;
	private Users users;
	private String lxrname;
	private String lxrtel;

	// Constructors

	/** default constructor */
	public Lxrs() {
	}

	/** full constructor */
	public Lxrs(Users users, String lxrname, String lxrtel) {
		this.users = users;
		this.lxrname = lxrname;
		this.lxrtel = lxrtel;
	}
	
	

	public Lxrs(String lxrname, String lxrtel) {
		super();
		this.lxrname = lxrname;
		this.lxrtel = lxrtel;
	}

	// Property accessors

	public Integer getLxrid() {
		return this.lxrid;
	}

	public void setLxrid(Integer lxrid) {
		this.lxrid = lxrid;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getLxrname() {
		return this.lxrname;
	}

	public void setLxrname(String lxrname) {
		this.lxrname = lxrname;
	}

	public String getLxrtel() {
		return this.lxrtel;
	}

	public void setLxrtel(String lxrtel) {
		this.lxrtel = lxrtel;
	}

}
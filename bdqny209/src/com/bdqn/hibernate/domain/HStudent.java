package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * HStudent entity. @author MyEclipse Persistence Tools
 */

public class HStudent implements java.io.Serializable {

	// Fields

	private Integer hsid;
	private String stuname;
	private String stusex;
	private Set HStuTecs = new HashSet(0);

	// Constructors

	/** default constructor */
	public HStudent() {
	}

	/** minimal constructor */
	public HStudent(String stuname, String stusex) {
		this.stuname = stuname;
		this.stusex = stusex;
	}

	/** full constructor */
	public HStudent(String stuname, String stusex, Set HStuTecs) {
		this.stuname = stuname;
		this.stusex = stusex;
		this.HStuTecs = HStuTecs;
	}

	// Property accessors

	public Integer getHsid() {
		return this.hsid;
	}

	public void setHsid(Integer hsid) {
		this.hsid = hsid;
	}

	public String getStuname() {
		return this.stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStusex() {
		return this.stusex;
	}

	public void setStusex(String stusex) {
		this.stusex = stusex;
	}

	public Set getHStuTecs() {
		return this.HStuTecs;
	}

	public void setHStuTecs(Set HStuTecs) {
		this.HStuTecs = HStuTecs;
	}

}
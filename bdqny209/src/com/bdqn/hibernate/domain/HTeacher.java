package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * HTeacher entity. @author MyEclipse Persistence Tools
 */

public class HTeacher implements java.io.Serializable {

	// Fields

	private Integer htid;
	private String tname;
	private Set HStuTecs = new HashSet(0);

	// Constructors

	/** default constructor */
	public HTeacher() {
	}

	/** minimal constructor */
	public HTeacher(String tname) {
		this.tname = tname;
	}

	/** full constructor */
	public HTeacher(String tname, Set HStuTecs) {
		this.tname = tname;
		this.HStuTecs = HStuTecs;
	}

	// Property accessors

	public Integer getHtid() {
		return this.htid;
	}

	public void setHtid(Integer htid) {
		this.htid = htid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Set getHStuTecs() {
		return this.HStuTecs;
	}

	public void setHStuTecs(Set HStuTecs) {
		this.HStuTecs = HStuTecs;
	}

}
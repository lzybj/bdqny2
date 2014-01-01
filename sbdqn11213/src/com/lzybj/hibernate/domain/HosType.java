package com.lzybj.hibernate.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * HosType entity. @author MyEclipse Persistence Tools
 */

public class HosType implements java.io.Serializable {

	// Fields

	private BigDecimal htid;
	private String htname;
	private Set hosHouses = new HashSet(0);

	// Constructors

	/** default constructor */
	public HosType() {
	}

	/** minimal constructor */
	public HosType(String htname) {
		this.htname = htname;
	}

	/** full constructor */
	public HosType(String htname, Set hosHouses) {
		this.htname = htname;
		this.hosHouses = hosHouses;
	}

	// Property accessors

	public BigDecimal getHtid() {
		return this.htid;
	}

	public void setHtid(BigDecimal htid) {
		this.htid = htid;
	}

	public String getHtname() {
		return this.htname;
	}

	public void setHtname(String htname) {
		this.htname = htname;
	}

	public Set getHosHouses() {
		return this.hosHouses;
	}

	public void setHosHouses(Set hosHouses) {
		this.hosHouses = hosHouses;
	}

}
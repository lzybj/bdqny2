package com.lzybj.hibernate.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * HosDistrict entity. @author MyEclipse Persistence Tools
 */

public class HosDistrict implements java.io.Serializable {

	// Fields

	private BigDecimal did;
	private String dname;
	private Set hosStreets = new HashSet(0);

	// Constructors

	/** default constructor */
	public HosDistrict() {
	}

	/** minimal constructor */
	public HosDistrict(String dname) {
		this.dname = dname;
	}

	/** full constructor */
	public HosDistrict(String dname, Set hosStreets) {
		this.dname = dname;
		this.hosStreets = hosStreets;
	}

	// Property accessors

	public BigDecimal getDid() {
		return this.did;
	}

	public void setDid(BigDecimal did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set getHosStreets() {
		return this.hosStreets;
	}

	public void setHosStreets(Set hosStreets) {
		this.hosStreets = hosStreets;
	}

}
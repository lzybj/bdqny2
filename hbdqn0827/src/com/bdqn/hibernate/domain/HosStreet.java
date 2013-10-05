package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * HosStreet entity. @author MyEclipse Persistence Tools
 */

public class HosStreet implements java.io.Serializable {

	// Fields

	private BigDecimal sid;
	private HosDistrict hosDistrict;
	private String sname;
	private Set hosHouses = new HashSet(0);

	// Constructors

	/** default constructor */
	public HosStreet() {
	}

	/** minimal constructor */
	public HosStreet(HosDistrict hosDistrict, String sname) {
		this.hosDistrict = hosDistrict;
		this.sname = sname;
	}

	/** full constructor */
	public HosStreet(HosDistrict hosDistrict, String sname, Set hosHouses) {
		this.hosDistrict = hosDistrict;
		this.sname = sname;
		this.hosHouses = hosHouses;
	}
	
	

	// Property accessors

	public HosStreet(BigDecimal sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public BigDecimal getSid() {
		return this.sid;
	}

	public void setSid(BigDecimal sid) {
		this.sid = sid;
	}

	public HosDistrict getHosDistrict() {
		return this.hosDistrict;
	}

	public void setHosDistrict(HosDistrict hosDistrict) {
		this.hosDistrict = hosDistrict;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set getHosHouses() {
		return this.hosHouses;
	}

	public void setHosHouses(Set hosHouses) {
		this.hosHouses = hosHouses;
	}

}
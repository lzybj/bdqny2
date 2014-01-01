package com.lzybj.hibernate.domain;

import java.sql.Timestamp;

/**
 * Houses entity. @author MyEclipse Persistence Tools
 */

public class Houses implements java.io.Serializable {

	// Fields

	private Integer hid;
	private Points points;
	private String hname;
	private String htype;
	private String haddress;
	private Double hprice;
	private Timestamp htime;

	// Constructors

	/** default constructor */
	public Houses() {
	}

	/** full constructor */
	public Houses(Points points, String hname, String htype, String haddress,
			Double hprice, Timestamp htime) {
		this.points = points;
		this.hname = hname;
		this.htype = htype;
		this.haddress = haddress;
		this.hprice = hprice;
		this.htime = htime;
	}
	
	

	public Houses(String hname, String htype, String haddress, Double hprice) {
		super();
		this.hname = hname;
		this.htype = htype;
		this.haddress = haddress;
		this.hprice = hprice;
	}

	// Property accessors

	public Integer getHid() {
		return this.hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public Points getPoints() {
		return this.points;
	}

	public void setPoints(Points points) {
		this.points = points;
	}

	public String getHname() {
		return this.hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHtype() {
		return this.htype;
	}

	public void setHtype(String htype) {
		this.htype = htype;
	}

	public String getHaddress() {
		return this.haddress;
	}

	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}

	public Double getHprice() {
		return this.hprice;
	}

	public void setHprice(Double hprice) {
		this.hprice = hprice;
	}

	public Timestamp getHtime() {
		return this.htime;
	}

	public void setHtime(Timestamp htime) {
		this.htime = htime;
	}

}
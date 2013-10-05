package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * HosHouse entity. @author MyEclipse Persistence Tools
 */

public class HosHouse implements java.io.Serializable {

	// Fields

	private BigDecimal hmid;
	private HosStreet hosStreet;
	private HosType hosType;
	private BigDecimal usid;
	private Double price;
	private String topic;
	private String contents;
	private Date htime;
	private String copy;

	// Constructors

	/** default constructor */
	public HosHouse() {
	}

	/** minimal constructor */
	public HosHouse(HosStreet hosStreet, HosType hosType, BigDecimal usid,
			Double price, String topic, String contents, Date htime) {
		this.hosStreet = hosStreet;
		this.hosType = hosType;
		this.usid = usid;
		this.price = price;
		this.topic = topic;
		this.contents = contents;
		this.htime = htime;
	}

	/** full constructor */
	public HosHouse(HosStreet hosStreet, HosType hosType, BigDecimal usid,
			Double price, String topic, String contents, Date htime, String copy) {
		this.hosStreet = hosStreet;
		this.hosType = hosType;
		this.usid = usid;
		this.price = price;
		this.topic = topic;
		this.contents = contents;
		this.htime = htime;
		this.copy = copy;
	}

	// Property accessors

	public BigDecimal getHmid() {
		return this.hmid;
	}

	public void setHmid(BigDecimal hmid) {
		this.hmid = hmid;
	}

	public HosStreet getHosStreet() {
		return this.hosStreet;
	}

	public void setHosStreet(HosStreet hosStreet) {
		this.hosStreet = hosStreet;
	}

	public HosType getHosType() {
		return this.hosType;
	}

	public void setHosType(HosType hosType) {
		this.hosType = hosType;
	}

	public BigDecimal getUsid() {
		return this.usid;
	}

	public void setUsid(BigDecimal usid) {
		this.usid = usid;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getHtime() {
		return this.htime;
	}

	public void setHtime(Date htime) {
		this.htime = htime;
	}

	public String getCopy() {
		return this.copy;
	}

	public void setCopy(String copy) {
		this.copy = copy;
	}

}
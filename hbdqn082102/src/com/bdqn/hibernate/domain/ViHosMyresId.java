package com.bdqn.hibernate.domain;

import java.util.Date;

/**
 * ViHosMyresId entity. @author MyEclipse Persistence Tools
 */

public class ViHosMyresId implements java.io.Serializable {

	// Fields

	private String dname;
	private String sname;
	private String htname;
	private Double price;
	private String uname;
	private Date htime;

	// Constructors

	/** default constructor */
	public ViHosMyresId() {
	}

	/** full constructor */
	public ViHosMyresId(String dname, String sname, String htname,
			Double price, String uname, Date htime) {
		this.dname = dname;
		this.sname = sname;
		this.htname = htname;
		this.price = price;
		this.uname = uname;
		this.htime = htime;
	}

	// Property accessors

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getHtname() {
		return this.htname;
	}

	public void setHtname(String htname) {
		this.htname = htname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Date getHtime() {
		return this.htime;
	}

	public void setHtime(Date htime) {
		this.htime = htime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViHosMyresId))
			return false;
		ViHosMyresId castOther = (ViHosMyresId) other;

		return ((this.getDname() == castOther.getDname()) || (this.getDname() != null
				&& castOther.getDname() != null && this.getDname().equals(
				castOther.getDname())))
				&& ((this.getSname() == castOther.getSname()) || (this
						.getSname() != null && castOther.getSname() != null && this
						.getSname().equals(castOther.getSname())))
				&& ((this.getHtname() == castOther.getHtname()) || (this
						.getHtname() != null && castOther.getHtname() != null && this
						.getHtname().equals(castOther.getHtname())))
				&& ((this.getPrice() == castOther.getPrice()) || (this
						.getPrice() != null && castOther.getPrice() != null && this
						.getPrice().equals(castOther.getPrice())))
				&& ((this.getUname() == castOther.getUname()) || (this
						.getUname() != null && castOther.getUname() != null && this
						.getUname().equals(castOther.getUname())))
				&& ((this.getHtime() == castOther.getHtime()) || (this
						.getHtime() != null && castOther.getHtime() != null && this
						.getHtime().equals(castOther.getHtime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDname() == null ? 0 : this.getDname().hashCode());
		result = 37 * result
				+ (getSname() == null ? 0 : this.getSname().hashCode());
		result = 37 * result
				+ (getHtname() == null ? 0 : this.getHtname().hashCode());
		result = 37 * result
				+ (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37 * result
				+ (getUname() == null ? 0 : this.getUname().hashCode());
		result = 37 * result
				+ (getHtime() == null ? 0 : this.getHtime().hashCode());
		return result;
	}

}
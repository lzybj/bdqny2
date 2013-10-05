package com.bdqn.hibernate.domain;

/**
 * ViHosResId entity. @author MyEclipse Persistence Tools
 */

public class ViHosResId implements java.io.Serializable {

	// Fields

	private String htname;
	private String uname;
	private String dname;
	private String sname;

	// Constructors

	/** default constructor */
	public ViHosResId() {
	}

	/** full constructor */
	public ViHosResId(String htname, String uname, String dname, String sname) {
		this.htname = htname;
		this.uname = uname;
		this.dname = dname;
		this.sname = sname;
	}

	// Property accessors

	public String getHtname() {
		return this.htname;
	}

	public void setHtname(String htname) {
		this.htname = htname;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViHosResId))
			return false;
		ViHosResId castOther = (ViHosResId) other;

		return ((this.getHtname() == castOther.getHtname()) || (this
				.getHtname() != null && castOther.getHtname() != null && this
				.getHtname().equals(castOther.getHtname())))
				&& ((this.getUname() == castOther.getUname()) || (this
						.getUname() != null && castOther.getUname() != null && this
						.getUname().equals(castOther.getUname())))
				&& ((this.getDname() == castOther.getDname()) || (this
						.getDname() != null && castOther.getDname() != null && this
						.getDname().equals(castOther.getDname())))
				&& ((this.getSname() == castOther.getSname()) || (this
						.getSname() != null && castOther.getSname() != null && this
						.getSname().equals(castOther.getSname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getHtname() == null ? 0 : this.getHtname().hashCode());
		result = 37 * result
				+ (getUname() == null ? 0 : this.getUname().hashCode());
		result = 37 * result
				+ (getDname() == null ? 0 : this.getDname().hashCode());
		result = 37 * result
				+ (getSname() == null ? 0 : this.getSname().hashCode());
		return result;
	}

}
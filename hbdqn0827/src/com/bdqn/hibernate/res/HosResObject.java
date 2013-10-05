package com.bdqn.hibernate.res;

import java.util.Date;

public class HosResObject {
	private String dname = "";
	private String sname = "";
	private String htname = "";
	private Double price;
	private String uname = "";
	private Date htime;
	public HosResObject(String dname, String sname, String htname,
			Double price, String uname, Date htime) {
		super();
		this.dname = dname;
		this.sname = sname;
		this.htname = htname;
		this.price = price;
		this.uname = uname;
		this.htime = htime;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getHtname() {
		return htname;
	}
	public void setHtname(String htname) {
		this.htname = htname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getHtime() {
		return htime;
	}
	public void setHtime(Date htime) {
		this.htime = htime;
	}
	
	
}

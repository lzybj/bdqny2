package com.bdqn.hibernate.res;

public class HosResObj2 {
	private String htname = "";
	private String uname = "";
	private String dname = "";
	private String sname = "";
	public String getHtname() {
		return htname;
	}
	public void setHtname(String htname) {
		this.htname = htname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
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
	public HosResObj2(String htname, String uname, String dname, String sname) {
		super();
		this.htname = htname;
		this.uname = uname;
		this.dname = dname;
		this.sname = sname;
	}
	
}

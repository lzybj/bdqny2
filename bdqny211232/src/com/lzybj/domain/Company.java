package com.lzybj.domain;

public class Company {
	private String compcode = "";
	private String compname = "";
	public Company(String compcode, String compname) {
		super();
		this.compcode = compcode;
		this.compname = compname;
	}
	public Company() {
		super();
	}
	public String getCompcode() {
		return compcode;
	}
	public void setCompcode(String compcode) {
		this.compcode = compcode;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	
}

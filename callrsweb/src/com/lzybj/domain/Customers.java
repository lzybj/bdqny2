package com.lzybj.domain;

public class Customers {
	private int cid = 0;
	private String cname = "";
	private String cpwd = "";
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
	public Customers(int cid, String cname, String cpwd) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpwd = cpwd;
	}
	public Customers() {
		super();
	}
}

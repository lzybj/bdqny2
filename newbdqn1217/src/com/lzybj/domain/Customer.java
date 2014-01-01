package com.lzybj.domain;

public class Customer {
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
	public Customer(int cid, String cname, String cpwd) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpwd = cpwd;
	}
	public Customer() {
		super();
	}
}

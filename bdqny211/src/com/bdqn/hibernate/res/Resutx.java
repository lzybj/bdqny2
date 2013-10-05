package com.bdqn.hibernate.res;

public class Resutx {
	private String uname = "";
	private String txname = "";
	private String txtel = "";
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getTxname() {
		return txname;
	}
	public void setTxname(String txname) {
		this.txname = txname;
	}
	public String getTxtel() {
		return txtel;
	}
	public void setTxtel(String txtel) {
		this.txtel = txtel;
	}
	public Resutx(String uname, String txname, String txtel) {
		super();
		this.uname = uname;
		this.txname = txname;
		this.txtel = txtel;
	}
	
}

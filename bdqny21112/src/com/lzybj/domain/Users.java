package com.lzybj.domain;

public class Users {
	private String uname = "";
	private String usex = "";
	private String uemail = "";
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public Users(String uname, String usex, String uemail) {
		super();
		this.uname = uname;
		this.usex = usex;
		this.uemail = uemail;
	}
	public Users() {
		super();
	}
}

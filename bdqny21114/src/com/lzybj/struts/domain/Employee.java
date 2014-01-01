package com.lzybj.struts.domain;

public class Employee {
	private String ecode = "";
	private String ename = "";
	private Group group = null;
	public String getEcode() {
		return ecode;
	}
	public void setEcode(String ecode) {
		this.ecode = ecode;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	public Employee(String ecode, String ename, Group group) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.group = group;
	}
	public Employee() {
		super();
	}
}

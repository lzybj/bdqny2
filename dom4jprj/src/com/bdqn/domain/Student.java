package com.bdqn.domain;

public class Student {
	private int stuid = 0;
	private String stuname = "";
	private int stuage = 0;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public Student(int stuid, String stuname, int stuage) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuage = stuage;
	}
}

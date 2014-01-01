package com.lzybj.domain;

public class Group {
	private String gname = "";
	private Company comp = null;
	

	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}
	
}

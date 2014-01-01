package com.lzybj.struts.domain;

public class Group {
	private String gcode = "";
	private String gname = "";
	private Company comp = null;
	public Group(String gcode, String gname, Company comp) {
		super();
		this.gcode = gcode;
		this.gname = gname;
		this.comp = comp;
	}
	public Group() {
		super();
	}
	public String getGcode() {
		return gcode;
	}
	public void setGcode(String gcode) {
		this.gcode = gcode;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Company getComp() {
		return comp;
	}
	public void setComp(Company comp) {
		this.comp = comp;
	}
	
	
}

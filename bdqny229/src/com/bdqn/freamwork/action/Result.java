package com.bdqn.freamwork.action;

public class Result {
	private String name = "";
	private String value = "";
	private boolean redirect = false;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public Result(String name, String value, boolean redirect) {
		super();
		this.name = name;
		this.value = value;
		this.redirect = redirect;
	}
}

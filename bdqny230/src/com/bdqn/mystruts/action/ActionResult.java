package com.bdqn.mystruts.action;

/**
 * 封装了ACTION的结果信息
 * name:逻辑地址
 * value:真实地址
 * redirect:是否重定向,true,重定向 false转发
 * @author lzybj
 *
 */
public class ActionResult {
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
	public ActionResult(String name, String value, boolean redirect) {
		super();
		this.name = name;
		this.value = value;
		this.redirect = redirect;
	}
	
}

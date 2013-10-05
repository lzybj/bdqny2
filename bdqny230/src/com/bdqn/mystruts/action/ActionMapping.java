package com.bdqn.mystruts.action;

import java.util.HashMap;
import java.util.Map;

/**
 * 封装在配置文件中(mystruts.xml)的Action信息
 * @author lzybj
 *
 */
public class ActionMapping {
	private String name = "";
	private String className = "";
	private Map<String,ActionResult> results = new HashMap<String, ActionResult>();
	public ActionMapping(String name, String className,
			Map<String, ActionResult> results) {
		super();
		this.name = name;
		this.className = className;
		this.results = results;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Map<String, ActionResult> getResults() {
		return results;
	}
	public void setResults(Map<String, ActionResult> results) {
		this.results = results;
	}
}

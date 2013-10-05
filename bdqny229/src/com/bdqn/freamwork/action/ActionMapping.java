package com.bdqn.freamwork.action;

import java.util.HashMap;
import java.util.Map;

public class ActionMapping {
	private String name = "";
	private String className = "";
	private Map<String,Result> results = new HashMap<String, Result>();
	public ActionMapping(String name, String className,
			Map<String, Result> results) {
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
	public Map<String, Result> getResults() {
		return results;
	}
	public void setResults(Map<String, Result> results) {
		this.results = results;
	}
}

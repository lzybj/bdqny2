package com.bdqn.hibernate.res;

public class HosResObj {
	private String dname = "";
	private String sname = "";
	private String htname = "";
	private Double price;
	private String topic = "";
	private String content = "";
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getHtname() {
		return htname;
	}
	public void setHtname(String htname) {
		this.htname = htname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public HosResObj(String dname, String sname, String htname, Double price,
			String topic, String content) {
		super();
		this.dname = dname;
		this.sname = sname;
		this.htname = htname;
		this.price = price;
		this.topic = topic;
		this.content = content;
	}
	
}

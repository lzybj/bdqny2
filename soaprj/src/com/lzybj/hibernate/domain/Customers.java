package com.lzybj.hibernate.domain;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Customers entity. @author MyEclipse Persistence Tools
 */

@XmlRootElement
public class Customers implements java.io.Serializable {

	// Fields

	private Integer cid;
	private String cname;
	private String cpwd;

	// Constructors

	/** default constructor */
	public Customers() {
	}

	/** full constructor */
	public Customers(String cname, String cpwd) {
		this.cname = cname;
		this.cpwd = cpwd;
	}

	// Property accessors

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCpwd() {
		return this.cpwd;
	}

	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}

}
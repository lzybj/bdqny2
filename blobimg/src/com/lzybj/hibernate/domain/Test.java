package com.lzybj.hibernate.domain;

import java.sql.Blob;

/**
 * Test entity. @author MyEclipse Persistence Tools
 */

public class Test implements java.io.Serializable {

	// Fields

	private Integer tid;
	private String tname;
	private Blob bigimg;
	private Blob smallimg;

	// Constructors

	/** default constructor */
	public Test() {
	}

	/** full constructor */
	public Test(String tname, Blob bigimg, Blob smallimg) {
		this.tname = tname;
		this.bigimg = bigimg;
		this.smallimg = smallimg;
	}

	// Property accessors

	public Integer getTid() {
		return this.tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return this.tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Blob getBigimg() {
		return this.bigimg;
	}

	public void setBigimg(Blob bigimg) {
		this.bigimg = bigimg;
	}

	public Blob getSmallimg() {
		return this.smallimg;
	}

	public void setSmallimg(Blob smallimg) {
		this.smallimg = smallimg;
	}

}
package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Points entity. @author MyEclipse Persistence Tools
 */

public class Points implements java.io.Serializable {

	// Fields

	private Integer pid;
	private Double pdj;
	private Double pxj;
	private Set houseses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Points() {
	}

	/** minimal constructor */
	public Points(Double pdj, Double pxj) {
		this.pdj = pdj;
		this.pxj = pxj;
	}

	/** full constructor */
	public Points(Double pdj, Double pxj, Set houseses) {
		this.pdj = pdj;
		this.pxj = pxj;
		this.houseses = houseses;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Double getPdj() {
		return this.pdj;
	}

	public void setPdj(Double pdj) {
		this.pdj = pdj;
	}

	public Double getPxj() {
		return this.pxj;
	}

	public void setPxj(Double pxj) {
		this.pxj = pxj;
	}

	public Set getHouseses() {
		return this.houseses;
	}

	public void setHouseses(Set houseses) {
		this.houseses = houseses;
	}

}
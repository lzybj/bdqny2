package com.bdqn.hibernate.domain;

/**
 * ViHosRes entity. @author MyEclipse Persistence Tools
 */

public class ViHosRes implements java.io.Serializable {

	// Fields

	private ViHosResId id;

	// Constructors

	/** default constructor */
	public ViHosRes() {
	}

	/** full constructor */
	public ViHosRes(ViHosResId id) {
		this.id = id;
	}

	// Property accessors

	public ViHosResId getId() {
		return this.id;
	}

	public void setId(ViHosResId id) {
		this.id = id;
	}

}
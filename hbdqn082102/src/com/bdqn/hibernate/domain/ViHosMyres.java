package com.bdqn.hibernate.domain;

/**
 * ViHosMyres entity. @author MyEclipse Persistence Tools
 */

public class ViHosMyres implements java.io.Serializable {

	// Fields

	private ViHosMyresId id;

	// Constructors

	/** default constructor */
	public ViHosMyres() {
	}

	/** full constructor */
	public ViHosMyres(ViHosMyresId id) {
		this.id = id;
	}

	// Property accessors

	public ViHosMyresId getId() {
		return this.id;
	}

	public void setId(ViHosMyresId id) {
		this.id = id;
	}

}
package com.bdqn.hibernate.domain;

/**
 * HStuTec entity. @author MyEclipse Persistence Tools
 */

public class HStuTec implements java.io.Serializable {

	// Fields

	private HStuTecId id;
	private HTeacher HTeacher;
	private HStudent HStudent;

	// Constructors

	/** default constructor */
	public HStuTec() {
	}

	/** full constructor */
	public HStuTec(HStuTecId id, HTeacher HTeacher, HStudent HStudent) {
		this.id = id;
		this.HTeacher = HTeacher;
		this.HStudent = HStudent;
	}

	// Property accessors

	public HStuTecId getId() {
		return this.id;
	}

	public void setId(HStuTecId id) {
		this.id = id;
	}

	public HTeacher getHTeacher() {
		return this.HTeacher;
	}

	public void setHTeacher(HTeacher HTeacher) {
		this.HTeacher = HTeacher;
	}

	public HStudent getHStudent() {
		return this.HStudent;
	}

	public void setHStudent(HStudent HStudent) {
		this.HStudent = HStudent;
	}

}
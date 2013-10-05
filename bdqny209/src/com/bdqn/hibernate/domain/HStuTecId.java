package com.bdqn.hibernate.domain;

/**
 * HStuTecId entity. @author MyEclipse Persistence Tools
 */

public class HStuTecId implements java.io.Serializable {

	// Fields

	private HStudent HStudent;
	private HTeacher HTeacher;

	// Constructors

	/** default constructor */
	public HStuTecId() {
	}

	/** full constructor */
	public HStuTecId(HStudent HStudent, HTeacher HTeacher) {
		this.HStudent = HStudent;
		this.HTeacher = HTeacher;
	}

	// Property accessors

	public HStudent getHStudent() {
		return this.HStudent;
	}

	public void setHStudent(HStudent HStudent) {
		this.HStudent = HStudent;
	}

	public HTeacher getHTeacher() {
		return this.HTeacher;
	}

	public void setHTeacher(HTeacher HTeacher) {
		this.HTeacher = HTeacher;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HStuTecId))
			return false;
		HStuTecId castOther = (HStuTecId) other;

		return ((this.getHStudent() == castOther.getHStudent()) || (this
				.getHStudent() != null && castOther.getHStudent() != null && this
				.getHStudent().equals(castOther.getHStudent())))
				&& ((this.getHTeacher() == castOther.getHTeacher()) || (this
						.getHTeacher() != null
						&& castOther.getHTeacher() != null && this
						.getHTeacher().equals(castOther.getHTeacher())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getHStudent() == null ? 0 : this.getHStudent().hashCode());
		result = 37 * result
				+ (getHTeacher() == null ? 0 : this.getHTeacher().hashCode());
		return result;
	}

}
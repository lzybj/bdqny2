package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * SysPosition entity. @author MyEclipse Persistence Tools
 */

public class SysPosition implements java.io.Serializable {

	// Fields

	private Integer id;
	private String nameCn;
	private String nameEn;
	private Set sysEmployees = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysPosition() {
	}

	/** minimal constructor */
	public SysPosition(Integer id, String nameCn, String nameEn) {
		this.id = id;
		this.nameCn = nameCn;
		this.nameEn = nameEn;
	}

	/** full constructor */
	public SysPosition(Integer id, String nameCn, String nameEn,
			Set sysEmployees) {
		this.id = id;
		this.nameCn = nameCn;
		this.nameEn = nameEn;
		this.sysEmployees = sysEmployees;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameCn() {
		return this.nameCn;
	}

	public void setNameCn(String nameCn) {
		this.nameCn = nameCn;
	}

	public String getNameEn() {
		return this.nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public Set getSysEmployees() {
		return this.sysEmployees;
	}

	public void setSysEmployees(Set sysEmployees) {
		this.sysEmployees = sysEmployees;
	}

}
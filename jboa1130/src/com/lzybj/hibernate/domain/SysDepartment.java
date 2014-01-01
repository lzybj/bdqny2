package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * SysDepartment entity. @author MyEclipse Persistence Tools
 */

public class SysDepartment implements java.io.Serializable {

	// Fields

	private Integer id;
	private SysEmployee sysEmployee;
	private String name;
	private Set sysEmployees = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysDepartment() {
	}

	/** minimal constructor */
	public SysDepartment(Integer id, SysEmployee sysEmployee, String name) {
		this.id = id;
		this.sysEmployee = sysEmployee;
		this.name = name;
	}

	/** full constructor */
	public SysDepartment(Integer id, SysEmployee sysEmployee, String name,
			Set sysEmployees) {
		this.id = id;
		this.sysEmployee = sysEmployee;
		this.name = name;
		this.sysEmployees = sysEmployees;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SysEmployee getSysEmployee() {
		return this.sysEmployee;
	}

	public void setSysEmployee(SysEmployee sysEmployee) {
		this.sysEmployee = sysEmployee;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getSysEmployees() {
		return this.sysEmployees;
	}

	public void setSysEmployees(Set sysEmployees) {
		this.sysEmployees = sysEmployees;
	}

}
package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * SysEmployee entity. @author MyEclipse Persistence Tools
 */

public class SysEmployee implements java.io.Serializable {

	// Fields

	private String sn;
	private SysPosition sysPosition;
	private SysDepartment sysDepartment;
	private String password;
	private String name;
	private String status;
	private Set bizAccounts = new HashSet(0);
	private Set bizCheckResults = new HashSet(0);
	private Set bizClaimVouchersForCreateSn = new HashSet(0);
	private Set sysDepartments = new HashSet(0);
	private Set bizClaimVouchersForNextDealSn = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysEmployee() {
	}

	/** minimal constructor */
	public SysEmployee(String sn, SysPosition sysPosition,
			SysDepartment sysDepartment, String password, String name,
			String status) {
		this.sn = sn;
		this.sysPosition = sysPosition;
		this.sysDepartment = sysDepartment;
		this.password = password;
		this.name = name;
		this.status = status;
	}

	/** full constructor */
	public SysEmployee(String sn, SysPosition sysPosition,
			SysDepartment sysDepartment, String password, String name,
			String status, Set bizAccounts, Set bizCheckResults,
			Set bizClaimVouchersForCreateSn, Set sysDepartments,
			Set bizClaimVouchersForNextDealSn) {
		this.sn = sn;
		this.sysPosition = sysPosition;
		this.sysDepartment = sysDepartment;
		this.password = password;
		this.name = name;
		this.status = status;
		this.bizAccounts = bizAccounts;
		this.bizCheckResults = bizCheckResults;
		this.bizClaimVouchersForCreateSn = bizClaimVouchersForCreateSn;
		this.sysDepartments = sysDepartments;
		this.bizClaimVouchersForNextDealSn = bizClaimVouchersForNextDealSn;
	}

	// Property accessors

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public SysPosition getSysPosition() {
		return this.sysPosition;
	}

	public void setSysPosition(SysPosition sysPosition) {
		this.sysPosition = sysPosition;
	}

	public SysDepartment getSysDepartment() {
		return this.sysDepartment;
	}

	public void setSysDepartment(SysDepartment sysDepartment) {
		this.sysDepartment = sysDepartment;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getBizAccounts() {
		return this.bizAccounts;
	}

	public void setBizAccounts(Set bizAccounts) {
		this.bizAccounts = bizAccounts;
	}

	public Set getBizCheckResults() {
		return this.bizCheckResults;
	}

	public void setBizCheckResults(Set bizCheckResults) {
		this.bizCheckResults = bizCheckResults;
	}

	public Set getBizClaimVouchersForCreateSn() {
		return this.bizClaimVouchersForCreateSn;
	}

	public void setBizClaimVouchersForCreateSn(Set bizClaimVouchersForCreateSn) {
		this.bizClaimVouchersForCreateSn = bizClaimVouchersForCreateSn;
	}

	public Set getSysDepartments() {
		return this.sysDepartments;
	}

	public void setSysDepartments(Set sysDepartments) {
		this.sysDepartments = sysDepartments;
	}

	public Set getBizClaimVouchersForNextDealSn() {
		return this.bizClaimVouchersForNextDealSn;
	}

	public void setBizClaimVouchersForNextDealSn(
			Set bizClaimVouchersForNextDealSn) {
		this.bizClaimVouchersForNextDealSn = bizClaimVouchersForNextDealSn;
	}

}
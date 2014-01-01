package com.lzybj.hibernate.domain;

import java.sql.Timestamp;

/**
 * BizAccount entity. @author MyEclipse Persistence Tools
 */

public class BizAccount implements java.io.Serializable {

	// Fields

	private Integer id;
	private SysEmployee sysEmployee;
	private BizClaimVoucher bizClaimVoucher;
	private String accType;
	private Integer accMoney;
	private Timestamp accTime;
	
	

	public BizAccount(SysEmployee sysEmployee, BizClaimVoucher bizClaimVoucher,
			String accType, Integer accMoney) {
		super();
		this.sysEmployee = sysEmployee;
		this.bizClaimVoucher = bizClaimVoucher;
		this.accType = accType;
		this.accMoney = accMoney;
	}

	// Constructors

	/** default constructor */
	public BizAccount() {
	}

	/** full constructor */
	public BizAccount(Integer id, SysEmployee sysEmployee,
			BizClaimVoucher bizClaimVoucher, String accType, Integer accMoney,
			Timestamp accTime) {
		this.id = id;
		this.sysEmployee = sysEmployee;
		this.bizClaimVoucher = bizClaimVoucher;
		this.accType = accType;
		this.accMoney = accMoney;
		this.accTime = accTime;
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

	public BizClaimVoucher getBizClaimVoucher() {
		return this.bizClaimVoucher;
	}

	public void setBizClaimVoucher(BizClaimVoucher bizClaimVoucher) {
		this.bizClaimVoucher = bizClaimVoucher;
	}

	public String getAccType() {
		return this.accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Integer getAccMoney() {
		return this.accMoney;
	}

	public void setAccMoney(Integer accMoney) {
		this.accMoney = accMoney;
	}

	public Timestamp getAccTime() {
		return this.accTime;
	}

	public void setAccTime(Timestamp accTime) {
		this.accTime = accTime;
	}

}
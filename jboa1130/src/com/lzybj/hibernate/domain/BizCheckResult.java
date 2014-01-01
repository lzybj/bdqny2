package com.lzybj.hibernate.domain;

import java.sql.Timestamp;

/**
 * BizCheckResult entity. @author MyEclipse Persistence Tools
 */

public class BizCheckResult implements java.io.Serializable {

	// Fields

	private Integer id;
	private SysEmployee sysEmployee;
	private BizClaimVoucher bizClaimVoucher;
	private String sheetType;
	private Timestamp checkTime;
	private String type;
	private String result;
	private String comm;

	// Constructors

	/** default constructor */
	public BizCheckResult() {
	}

	/** full constructor */
	public BizCheckResult(Integer id, SysEmployee sysEmployee,
			BizClaimVoucher bizClaimVoucher, String sheetType,
			Timestamp checkTime, String type, String result, String comm) {
		this.id = id;
		this.sysEmployee = sysEmployee;
		this.bizClaimVoucher = bizClaimVoucher;
		this.sheetType = sheetType;
		this.checkTime = checkTime;
		this.type = type;
		this.result = result;
		this.comm = comm;
	}
	
	

	public BizCheckResult(SysEmployee sysEmployee,
			BizClaimVoucher bizClaimVoucher, String sheetType, String type,
			String result, String comm) {
		super();
		this.sysEmployee = sysEmployee;
		this.bizClaimVoucher = bizClaimVoucher;
		this.sheetType = sheetType;
		this.type = type;
		this.result = result;
		this.comm = comm;
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

	public String getSheetType() {
		return this.sheetType;
	}

	public void setSheetType(String sheetType) {
		this.sheetType = sheetType;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getComm() {
		return this.comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

}
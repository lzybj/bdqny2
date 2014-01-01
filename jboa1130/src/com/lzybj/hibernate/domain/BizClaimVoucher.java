package com.lzybj.hibernate.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * BizClaimVoucher entity. @author MyEclipse Persistence Tools
 */

public class BizClaimVoucher implements java.io.Serializable {

	// Fields

	private Integer id;
	private SysEmployee sysEmployeeByNextDealSn;
	private SysEmployee sysEmployeeByCreateSn;
	private Timestamp createTime;
	private String enent;
	private Double totalAcount;
	private String status;
	private Set bizClaimVoucherDetails = new HashSet(0);
	private Set bizAccounts = new HashSet(0);
	private Set bizCheckResults = new HashSet(0);

	// Constructors

	/** default constructor */
	public BizClaimVoucher() {
	}

	/** minimal constructor */
	public BizClaimVoucher(Integer id, SysEmployee sysEmployeeByCreateSn,
			Timestamp createTime, String enent, Double totalAcount,
			String status) {
		this.id = id;
		this.sysEmployeeByCreateSn = sysEmployeeByCreateSn;
		this.createTime = createTime;
		this.enent = enent;
		this.totalAcount = totalAcount;
		this.status = status;
	}

	/** full constructor */
	public BizClaimVoucher(Integer id, SysEmployee sysEmployeeByNextDealSn,
			SysEmployee sysEmployeeByCreateSn, Timestamp createTime,
			String enent, Double totalAcount, String status,
			Set bizClaimVoucherDetails, Set bizAccounts, Set bizCheckResults) {
		this.id = id;
		this.sysEmployeeByNextDealSn = sysEmployeeByNextDealSn;
		this.sysEmployeeByCreateSn = sysEmployeeByCreateSn;
		this.createTime = createTime;
		this.enent = enent;
		this.totalAcount = totalAcount;
		this.status = status;
		this.bizClaimVoucherDetails = bizClaimVoucherDetails;
		this.bizAccounts = bizAccounts;
		this.bizCheckResults = bizCheckResults;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SysEmployee getSysEmployeeByNextDealSn() {
		return this.sysEmployeeByNextDealSn;
	}

	public void setSysEmployeeByNextDealSn(SysEmployee sysEmployeeByNextDealSn) {
		this.sysEmployeeByNextDealSn = sysEmployeeByNextDealSn;
	}

	public SysEmployee getSysEmployeeByCreateSn() {
		return this.sysEmployeeByCreateSn;
	}

	public void setSysEmployeeByCreateSn(SysEmployee sysEmployeeByCreateSn) {
		this.sysEmployeeByCreateSn = sysEmployeeByCreateSn;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getEnent() {
		return this.enent;
	}

	public void setEnent(String enent) {
		this.enent = enent;
	}

	public Double getTotalAcount() {
		return this.totalAcount;
	}

	public void setTotalAcount(Double totalAcount) {
		this.totalAcount = totalAcount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set getBizClaimVoucherDetails() {
		return this.bizClaimVoucherDetails;
	}

	public void setBizClaimVoucherDetails(Set bizClaimVoucherDetails) {
		this.bizClaimVoucherDetails = bizClaimVoucherDetails;
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

}
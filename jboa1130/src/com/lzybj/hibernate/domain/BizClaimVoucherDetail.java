package com.lzybj.hibernate.domain;

/**
 * BizClaimVoucherDetail entity. @author MyEclipse Persistence Tools
 */

public class BizClaimVoucherDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private SysDictionary sysDictionary;
	private BizClaimVoucher bizClaimVoucher;
	private Double account;
	private String des;

	// Constructors

	/** default constructor */
	public BizClaimVoucherDetail() {
	}

	/** full constructor */
	public BizClaimVoucherDetail(Integer id, SysDictionary sysDictionary,
			BizClaimVoucher bizClaimVoucher, Double account, String des) {
		this.id = id;
		this.sysDictionary = sysDictionary;
		this.bizClaimVoucher = bizClaimVoucher;
		this.account = account;
		this.des = des;
	}

	
	
	public BizClaimVoucherDetail(SysDictionary sysDictionary,
			BizClaimVoucher bizClaimVoucher, Double account, String des) {
		super();
		this.sysDictionary = sysDictionary;
		this.bizClaimVoucher = bizClaimVoucher;
		this.account = account;
		this.des = des;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SysDictionary getSysDictionary() {
		return this.sysDictionary;
	}

	public void setSysDictionary(SysDictionary sysDictionary) {
		this.sysDictionary = sysDictionary;
	}

	public BizClaimVoucher getBizClaimVoucher() {
		return this.bizClaimVoucher;
	}

	public void setBizClaimVoucher(BizClaimVoucher bizClaimVoucher) {
		this.bizClaimVoucher = bizClaimVoucher;
	}

	public Double getAccount() {
		return this.account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}
package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * SysDictionary entity. @author MyEclipse Persistence Tools
 */

public class SysDictionary implements java.io.Serializable {

	// Fields

	private Integer id;
	private String item;
	private Set bizClaimVoucherDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public SysDictionary() {
	}

	/** minimal constructor */
	public SysDictionary(Integer id, String item) {
		this.id = id;
		this.item = item;
	}

	/** full constructor */
	public SysDictionary(Integer id, String item, Set bizClaimVoucherDetails) {
		this.id = id;
		this.item = item;
		this.bizClaimVoucherDetails = bizClaimVoucherDetails;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Set getBizClaimVoucherDetails() {
		return this.bizClaimVoucherDetails;
	}

	public void setBizClaimVoucherDetails(Set bizClaimVoucherDetails) {
		this.bizClaimVoucherDetails = bizClaimVoucherDetails;
	}

}
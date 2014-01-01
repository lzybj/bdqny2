package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * VoteSubject entity. @author MyEclipse Persistence Tools
 */

public class VoteSubject implements java.io.Serializable {

	// Fields

	private Integer vsId;
	private String vsTitle;
	private Integer vsType;
	private Set voteOptions = new HashSet(0);
	private Set voteItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public VoteSubject() {
	}

	/** minimal constructor */
	public VoteSubject(String vsTitle, Integer vsType) {
		this.vsTitle = vsTitle;
		this.vsType = vsType;
	}

	/** full constructor */
	public VoteSubject(String vsTitle, Integer vsType, Set voteOptions,
			Set voteItems) {
		this.vsTitle = vsTitle;
		this.vsType = vsType;
		this.voteOptions = voteOptions;
		this.voteItems = voteItems;
	}

	// Property accessors

	public Integer getVsId() {
		return this.vsId;
	}

	public void setVsId(Integer vsId) {
		this.vsId = vsId;
	}

	public String getVsTitle() {
		return this.vsTitle;
	}

	public void setVsTitle(String vsTitle) {
		this.vsTitle = vsTitle;
	}

	public Integer getVsType() {
		return this.vsType;
	}

	public void setVsType(Integer vsType) {
		this.vsType = vsType;
	}

	public Set getVoteOptions() {
		return this.voteOptions;
	}

	public void setVoteOptions(Set voteOptions) {
		this.voteOptions = voteOptions;
	}

	public Set getVoteItems() {
		return this.voteItems;
	}

	public void setVoteItems(Set voteItems) {
		this.voteItems = voteItems;
	}

}
package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * VoteOption entity. @author MyEclipse Persistence Tools
 */

public class VoteOption implements java.io.Serializable {

	// Fields

	private Integer voId;
	private VoteSubject voteSubject;
	private String voOption;
	private Integer voOrder;
	private Set voteItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public VoteOption() {
	}

	/** minimal constructor */
	public VoteOption(VoteSubject voteSubject, String voOption, Integer voOrder) {
		this.voteSubject = voteSubject;
		this.voOption = voOption;
		this.voOrder = voOrder;
	}

	/** full constructor */
	public VoteOption(VoteSubject voteSubject, String voOption,
			Integer voOrder, Set voteItems) {
		this.voteSubject = voteSubject;
		this.voOption = voOption;
		this.voOrder = voOrder;
		this.voteItems = voteItems;
	}

	// Property accessors

	public Integer getVoId() {
		return this.voId;
	}

	public void setVoId(Integer voId) {
		this.voId = voId;
	}

	public VoteSubject getVoteSubject() {
		return this.voteSubject;
	}

	public void setVoteSubject(VoteSubject voteSubject) {
		this.voteSubject = voteSubject;
	}

	public String getVoOption() {
		return this.voOption;
	}

	public void setVoOption(String voOption) {
		this.voOption = voOption;
	}

	public Integer getVoOrder() {
		return this.voOrder;
	}

	public void setVoOrder(Integer voOrder) {
		this.voOrder = voOrder;
	}

	public Set getVoteItems() {
		return this.voteItems;
	}

	public void setVoteItems(Set voteItems) {
		this.voteItems = voteItems;
	}

}
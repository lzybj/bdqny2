package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * VoteUser entity. @author MyEclipse Persistence Tools
 */

public class VoteUser implements java.io.Serializable {

	// Fields

	private Integer vuUserId;
	private String vuUserName;
	private String vuPassword;
	private Set voteItems = new HashSet(0);

	// Constructors

	/** default constructor */
	public VoteUser() {
	}

	/** minimal constructor */
	public VoteUser(String vuUserName, String vuPassword) {
		this.vuUserName = vuUserName;
		this.vuPassword = vuPassword;
	}

	/** full constructor */
	public VoteUser(String vuUserName, String vuPassword, Set voteItems) {
		this.vuUserName = vuUserName;
		this.vuPassword = vuPassword;
		this.voteItems = voteItems;
	}

	// Property accessors

	public Integer getVuUserId() {
		return this.vuUserId;
	}

	public void setVuUserId(Integer vuUserId) {
		this.vuUserId = vuUserId;
	}

	public String getVuUserName() {
		return this.vuUserName;
	}

	public void setVuUserName(String vuUserName) {
		this.vuUserName = vuUserName;
	}

	public String getVuPassword() {
		return this.vuPassword;
	}

	public void setVuPassword(String vuPassword) {
		this.vuPassword = vuPassword;
	}

	public Set getVoteItems() {
		return this.voteItems;
	}

	public void setVoteItems(Set voteItems) {
		this.voteItems = voteItems;
	}

}
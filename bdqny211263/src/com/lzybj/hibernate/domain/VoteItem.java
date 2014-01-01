package com.lzybj.hibernate.domain;

/**
 * VoteItem entity. @author MyEclipse Persistence Tools
 */

public class VoteItem implements java.io.Serializable {

	// Fields

	private Integer viId;
	private VoteOption voteOption;
	private VoteUser voteUser;
	private VoteSubject voteSubject;

	// Constructors

	/** default constructor */
	public VoteItem() {
	}

	/** full constructor */
	public VoteItem(VoteOption voteOption, VoteUser voteUser,
			VoteSubject voteSubject) {
		this.voteOption = voteOption;
		this.voteUser = voteUser;
		this.voteSubject = voteSubject;
	}

	// Property accessors

	public Integer getViId() {
		return this.viId;
	}

	public void setViId(Integer viId) {
		this.viId = viId;
	}

	public VoteOption getVoteOption() {
		return this.voteOption;
	}

	public void setVoteOption(VoteOption voteOption) {
		this.voteOption = voteOption;
	}

	public VoteUser getVoteUser() {
		return this.voteUser;
	}

	public void setVoteUser(VoteUser voteUser) {
		this.voteUser = voteUser;
	}

	public VoteSubject getVoteSubject() {
		return this.voteSubject;
	}

	public void setVoteSubject(VoteSubject voteSubject) {
		this.voteSubject = voteSubject;
	}

}
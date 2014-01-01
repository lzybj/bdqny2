package com.lzybj.hibernate.resobj;

import com.lzybj.hibernate.domain.VoteOption;

public class VoteTotalObj {
	private VoteOption voteOption;
	private Long num;
	private int sum;
	private String numlv = "";

	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String getNumlv() {
		double temp = (num.doubleValue()/sum)*100;
		numlv = String.valueOf(temp) + "%";
		return numlv;
	}
	public void setNumlv(String numlv) {
		this.numlv = numlv;
	}
	public VoteOption getVoteOption() {
		return voteOption;
	}
	public void setVoteOption(VoteOption voteOption) {
		this.voteOption = voteOption;
	}
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public VoteTotalObj(VoteOption voteOption, Long num) {
		super();
		this.voteOption = voteOption;
		this.num = num;
	}
	public VoteTotalObj() {
		super();
	}
}

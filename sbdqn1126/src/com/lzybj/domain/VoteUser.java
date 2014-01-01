package com.lzybj.domain;

public class VoteUser {
	private int vuId = 0;
	private String vuUserName = "";
	private String vuPassword = "";
	public int getVuId() {
		return vuId;
	}
	public void setVuId(int vuId) {
		this.vuId = vuId;
	}
	public String getVuUserName() {
		return vuUserName;
	}
	public void setVuUserName(String vuUserName) {
		this.vuUserName = vuUserName;
	}
	public String getVuPassword() {
		return vuPassword;
	}
	public void setVuPassword(String vuPassword) {
		this.vuPassword = vuPassword;
	}
	public VoteUser(int vuId, String vuUserName, String vuPassword) {
		super();
		this.vuId = vuId;
		this.vuUserName = vuUserName;
		this.vuPassword = vuPassword;
	}
	public VoteUser() {
		super();
	}
	public VoteUser(String vuUserName, String vuPassword) {
		super();
		this.vuUserName = vuUserName;
		this.vuPassword = vuPassword;
	}
}

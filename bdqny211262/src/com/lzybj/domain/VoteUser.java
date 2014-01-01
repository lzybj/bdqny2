package com.lzybj.domain;

public class VoteUser {
	private int vuId = 0;
	private String vuUsername = "";
	private String vuPassword = "";
	public int getVuId() {
		return vuId;
	}
	public void setVuId(int vuId) {
		this.vuId = vuId;
	}
	public String getVuUsername() {
		return vuUsername;
	}
	public void setVuUsername(String vuUsername) {
		this.vuUsername = vuUsername;
	}
	public String getVuPassword() {
		return vuPassword;
	}
	public void setVuPassword(String vuPassword) {
		this.vuPassword = vuPassword;
	}
	public VoteUser(int vuId, String vuUsername, String vuPassword) {
		super();
		this.vuId = vuId;
		this.vuUsername = vuUsername;
		this.vuPassword = vuPassword;
	}
	public VoteUser() {
		super();
	}
	public VoteUser(String vuUsername, String vuPassword) {
		super();
		this.vuUsername = vuUsername;
		this.vuPassword = vuPassword;
	}
}

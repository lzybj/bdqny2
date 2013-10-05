package com.lzybj.hibernate.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * SmsUsers entity. @author MyEclipse Persistence Tools
 */

@Entity
public class SmsUsers implements java.io.Serializable {

	// Fields

	@Id
	@GeneratedValue
	private Integer usid;
	private String uname;
	private String upwd;
	private Set smsesForSendUsid = new HashSet(0);
	private Set smsesForResvUsid = new HashSet(0);

	// Constructors

	/** default constructor */
	public SmsUsers() {
	}

	/** full constructor */
	public SmsUsers(String uname, String upwd, Set smsesForSendUsid,
			Set smsesForResvUsid) {
		this.uname = uname;
		this.upwd = upwd;
		this.smsesForSendUsid = smsesForSendUsid;
		this.smsesForResvUsid = smsesForResvUsid;
	}

	// Property accessors

	public Integer getUsid() {
		return this.usid;
	}

	public void setUsid(Integer usid) {
		this.usid = usid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Set getSmsesForSendUsid() {
		return this.smsesForSendUsid;
	}

	public void setSmsesForSendUsid(Set smsesForSendUsid) {
		this.smsesForSendUsid = smsesForSendUsid;
	}

	public Set getSmsesForResvUsid() {
		return this.smsesForResvUsid;
	}

	public void setSmsesForResvUsid(Set smsesForResvUsid) {
		this.smsesForResvUsid = smsesForResvUsid;
	}

}
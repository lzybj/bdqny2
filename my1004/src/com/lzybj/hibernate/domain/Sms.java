package com.lzybj.hibernate.domain;

import java.util.Date;

/**
 * Sms entity. @author MyEclipse Persistence Tools
 */

public class Sms implements java.io.Serializable {

	// Fields

	private Integer smsId;
	private SmsUsers smsUsersBySendUsid;
	private SmsUsers smsUsersByResvUsid;
	private String smsContent;
	private Integer smsState;
	private Date smsDate;

	// Constructors

	/** default constructor */
	public Sms() {
	}

	/** full constructor */
	public Sms(SmsUsers smsUsersBySendUsid, SmsUsers smsUsersByResvUsid,
			String smsContent, Integer smsState, Date smsDate) {
		this.smsUsersBySendUsid = smsUsersBySendUsid;
		this.smsUsersByResvUsid = smsUsersByResvUsid;
		this.smsContent = smsContent;
		this.smsState = smsState;
		this.smsDate = smsDate;
	}

	// Property accessors

	public Integer getSmsId() {
		return this.smsId;
	}

	public void setSmsId(Integer smsId) {
		this.smsId = smsId;
	}

	public SmsUsers getSmsUsersBySendUsid() {
		return this.smsUsersBySendUsid;
	}

	public void setSmsUsersBySendUsid(SmsUsers smsUsersBySendUsid) {
		this.smsUsersBySendUsid = smsUsersBySendUsid;
	}

	public SmsUsers getSmsUsersByResvUsid() {
		return this.smsUsersByResvUsid;
	}

	public void setSmsUsersByResvUsid(SmsUsers smsUsersByResvUsid) {
		this.smsUsersByResvUsid = smsUsersByResvUsid;
	}

	public String getSmsContent() {
		return this.smsContent;
	}

	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}

	public Integer getSmsState() {
		return this.smsState;
	}

	public void setSmsState(Integer smsState) {
		this.smsState = smsState;
	}

	public Date getSmsDate() {
		return this.smsDate;
	}

	public void setSmsDate(Date smsDate) {
		this.smsDate = smsDate;
	}

}
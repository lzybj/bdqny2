package com.bdqn.hibernate.resobj;

import java.util.Date;

public class SmsResObj {
	private Integer smsId;
	private String sendUName;
	private String resvUName;
	private String smsContent;
	private Date smsDate;
	public SmsResObj(Integer smsId, String sendUName, String resvUName,
			String smsContent, Date smsDate) {
		super();
		this.smsId = smsId;
		this.sendUName = sendUName;
		this.resvUName = resvUName;
		this.smsContent = smsContent;
		this.smsDate = smsDate;
	}
	public Integer getSmsId() {
		return smsId;
	}
	public void setSmsId(Integer smsId) {
		this.smsId = smsId;
	}
	public String getSendUName() {
		return sendUName;
	}
	public void setSendUName(String sendUName) {
		this.sendUName = sendUName;
	}
	public String getResvUName() {
		return resvUName;
	}
	public void setResvUName(String resvUName) {
		this.resvUName = resvUName;
	}
	public String getSmsContent() {
		return smsContent;
	}
	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
	}
	public Date getSmsDate() {
		return smsDate;
	}
	public void setSmsDate(Date smsDate) {
		this.smsDate = smsDate;
	}
	
}

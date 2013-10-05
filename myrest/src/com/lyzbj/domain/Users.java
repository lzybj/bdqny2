package com.lyzbj.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Users {
	private int usid = 0;
	private String userName = "";
	private String passWord = "";
	public int getUsid() {
		return usid;
	}
	public void setUsid(int usid) {
		this.usid = usid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
}

package com.lzybj.struts.action;

import com.lzybj.hibernate.domain.Lxrs;
import com.lzybj.hibernate.domain.Users;
import com.lzybj.service.UsersService;
import com.opensymphony.xwork2.ActionContext;

public class UsersAction {
	private Users myuser = null;
	private Lxrs mylxr = null;
	
	private UsersService usersservice = null;
	
	
	public UsersService getUsersservice() {
		return usersservice;
	}
	public void setUsersservice(UsersService usersservice) {
		this.usersservice = usersservice;
	}
	public Users getMyuser() {
		return myuser;
	}
	public void setMyuser(Users myuser) {
		this.myuser = myuser;
	}
	public Lxrs getMylxr() {
		return mylxr;
	}
	public void setMylxr(Lxrs mylxr) {
		this.mylxr = mylxr;
	}
	
	public String reg(){
		mylxr.setLxrname(myuser.getUname());
		mylxr.setUsers(myuser);
		usersservice.addUsers(myuser, mylxr);
		return "succ";
	}
	
	public String login(){
		Users u = usersservice.isLogin(myuser);
		if(u != null){
			ActionContext.getContext().getSession().put("myuser",u);
			return "succ";
		}
		return "fail";
	}
	
}

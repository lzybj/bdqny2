package com.lzybj.struts.action;

import java.util.List;

import com.lzybj.hibernate.domain.BizClaimVoucher;
import com.lzybj.hibernate.domain.SysEmployee;
import com.lzybj.service.BizClaimVoucherService;
import com.lzybj.service.SysEmployeeService;
import com.opensymphony.xwork2.ActionContext;

public class SysEmployeeAction {
	private String uname = "";
	private String upwd = "";
	private String res = "";
	private String comm = "";
	private String bxdid = "";
	
	
	private SysEmployeeService ses = null;	
	private BizClaimVoucherService bxdservice = null;
	
	
	
	private List<BizClaimVoucher> bxds = null;
	
	
	
	
	public String getBxdid() {
		return bxdid;
	}

	public void setBxdid(String bxdid) {
		this.bxdid = bxdid;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public BizClaimVoucherService getBxdservice() {
		return bxdservice;
	}

	public void setBxdservice(BizClaimVoucherService bxdservice) {
		this.bxdservice = bxdservice;
	}

	public List<BizClaimVoucher> getBxds() {
		return bxds;
	}

	public void setBxds(List<BizClaimVoucher> bxds) {
		this.bxds = bxds;
	}


	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public SysEmployeeService getSes() {
		return ses;
	}

	public void setSes(SysEmployeeService ses) {
		this.ses = ses;
	}
	
	public String login(){
		SysEmployee se = ses.isLogin(uname, upwd);
		if(se != null){
			ActionContext.getContext().getSession().put("se",se);
			return "succ";
		}
		return "fail";
	}
	
	public String viewdshlist(){
		SysEmployee se = (SysEmployee)ActionContext.getContext().getSession().get("se");
		this.setBxds(ses.findByDshList(se));
		return "succ";
	}
	
	public String spbxd(){
		//获得当前审核人职务
		SysEmployee se = (SysEmployee)ActionContext.getContext().getSession().get("se");
		String postionName = se.getSysPosition().getNameEn();
		if(postionName.equals("BMJL")){
			bxdservice.spbxdFormPM(bxdid,se, res,comm);
		}else{
			if(postionName.equals("ZJL")){
				bxdservice.spbxdFromZJL(bxdid, se, res, comm);
			}else{
				bxdservice.spbxdFromCW(bxdid, se, res, comm);
			}
		}
		return "succ";
	}
	
}

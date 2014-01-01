package com.lzybj.struts.action;

import java.util.Set;

import com.lzybj.hibernate.domain.BizClaimVoucher;
import com.lzybj.hibernate.domain.BizClaimVoucherDetail;
import com.lzybj.hibernate.domain.SysDictionary;
import com.lzybj.hibernate.domain.SysEmployee;
import com.lzybj.service.BizClaimVoucherService;
import com.lzybj.service.SysDictionaryService;
import com.opensymphony.xwork2.ActionContext;

public class BizClaimVoucherAction {
	private String event = "";
	private String itemid = "";
	private String jiner = "";
	private String desc = "";
	private String submit = "";
	private String bxdid = "";
	
	private BizClaimVoucher bxd = null;
	
	
	private SysDictionaryService itemservice = null;
	private BizClaimVoucherService bxdservice = null;
	
	

	public String getBxdid() {
		return bxdid;
	}

	public void setBxdid(String bxdid) {
		this.bxdid = bxdid;
	}

	public BizClaimVoucher getBxd() {
		return bxd;
	}

	public void setBxd(BizClaimVoucher bxd) {
		this.bxd = bxd;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public BizClaimVoucherService getBxdservice() {
		return bxdservice;
	}

	public void setBxdservice(BizClaimVoucherService bxdservice) {
		this.bxdservice = bxdservice;
	}

	public SysDictionaryService getItemservice() {
		return itemservice;
	}

	public void setItemservice(SysDictionaryService itemservice) {
		this.itemservice = itemservice;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public String getJiner() {
		return jiner;
	}

	public void setJiner(String jiner) {
		this.jiner = jiner;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}
	
	public String createbxd(){
		SysEmployee se = (SysEmployee)ActionContext.getContext().getSession().get("se");
		BizClaimVoucher bxd = new BizClaimVoucher();
		//创建员工对象
		bxd.setSysEmployeeByCreateSn(se);
		//当前步骤下一步执行员工对象
		SysEmployee nextDeal = se.getSysDepartment().getSysEmployee();
		bxd.setSysEmployeeByNextDealSn(nextDeal);
		//事由
		bxd.setEnent(event);
		//状态
		bxd.setStatus("新创建");
		//将临时报销单存入session
		ActionContext.getContext().getSession().put("bxdtemp",bxd);
		return "succ";
	}
	
	public String createbxddetail(){
		//从sesssion中取出报销单对象
		BizClaimVoucher bxd = (BizClaimVoucher)ActionContext.getContext().getSession().get("bxdtemp");
		//获得项目对象
		SysDictionary item = itemservice.findByItemid(itemid);
		//创建报销单明细对象
		BizClaimVoucherDetail bxd_detail = new BizClaimVoucherDetail(item, bxd,new Double(jiner), desc);
		//将报销单明细对象添加到报销单中的报销单明细集合中
		bxd.getBizClaimVoucherDetails().add(bxd_detail);
		//再次将报销单对象放入session
		ActionContext.getContext().getSession().put("bxdtemp",bxd);
		return "succ";
	}
	
	public String ylviewbxd(){
		BizClaimVoucher bxd = (BizClaimVoucher)ActionContext.getContext().getSession().get("bxdtemp");
		double sum = 0;
		Set<BizClaimVoucherDetail> details = bxd.getBizClaimVoucherDetails();
		for (BizClaimVoucherDetail bizClaimVoucherDetail : details) {
			sum = sum + bizClaimVoucherDetail.getAccount().doubleValue();
		}
		bxd.setTotalAcount(sum);
		ActionContext.getContext().getSession().put("bxdtemp",bxd);
		return "succ";
	}
	
	public String submitbxd(){
		BizClaimVoucher bxd = (BizClaimVoucher)ActionContext.getContext().getSession().get("bxdtemp");
		if(!submit.equals("新创建")){
			bxd.setStatus("待审核");
		}
		bxdservice.addBXD(bxd);
		ActionContext.getContext().getSession().remove("bxdtemp");
		return "succ";
	}
	
	public String viewspbxddetail(){
		this.setBxd(bxdservice.findByBxdId(bxdid));
		return "succ";
	}
	
}

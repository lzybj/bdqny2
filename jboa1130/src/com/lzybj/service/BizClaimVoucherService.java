package com.lzybj.service;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lzybj.hibernate.domain.BizAccount;
import com.lzybj.hibernate.domain.BizCheckResult;
import com.lzybj.hibernate.domain.BizClaimVoucher;
import com.lzybj.hibernate.domain.SysEmployee;

public class BizClaimVoucherService extends HibernateDaoSupport{
	private SysEmployeeService empservice = null;
	
	
	public SysEmployeeService getEmpservice() {
		return empservice;
	}

	public void setEmpservice(SysEmployeeService empservice) {
		this.empservice = empservice;
	}

	public boolean addBXD(BizClaimVoucher bxd){
		this.getHibernateTemplate().save(bxd);
		return true;
	}
	
	public BizClaimVoucher findByBxdId(String bxdid){
		BizClaimVoucher bxd = this.getHibernateTemplate().get(BizClaimVoucher.class,new Integer(bxdid));
		return bxd;
	}
	
	public boolean spbxdFormPM(String bxdid,SysEmployee se,String result,String comm){
		//获得报销单对象
		BizClaimVoucher bxd = this.findByBxdId(bxdid);
		//获得报销单金额
		double bxdaccount = bxd.getTotalAcount();
		//判断报销单审核类型
		String sheet_type = "";
		if(bxdaccount <= 5000){
			sheet_type = "部门经理审核类型单据";
		}else{
			sheet_type = "总经理审核类型单据";
		}
		//设置审核类型(例如：部门经理审核，总经理审核，财务审核)
		String vType = "部门经理审核";
		//判断审核结果
		if(result.equals("审核通过")){
			//判断金额
			if(bxdaccount <= 5000){//状态：已审批；下一个处理人：财务
				bxd.setStatus("已审批");
				SysEmployee nextDealSe = empservice.findByPostionName("CW");
				bxd.setSysEmployeeByNextDealSn(nextDealSe);
			}else{//状态：已提交；下一个处理人：总经理
				bxd.setStatus("已提交");
				SysEmployee nextDealSe = empservice.findByPostionName("ZJL");
				bxd.setSysEmployeeByNextDealSn(nextDealSe);
			}
		}else{
			if(result.equals("审核拒绝")){
				bxd.setStatus("拒绝");
				bxd.setSysEmployeeByNextDealSn(null);
			}else{//打回
				bxd.setStatus("打回");
				bxd.setSysEmployeeByNextDealSn(bxd.getSysEmployeeByCreateSn());
			}
		}
		//生成审核结果对象
		BizCheckResult res = new BizCheckResult(se, bxd, sheet_type, vType, result, comm);
		//保存相关对象
		this.getHibernateTemplate().update(bxd);
		this.getHibernateTemplate().save(res);
		return true;
	}
	
	public boolean spbxdFromZJL(String bxdid,SysEmployee se,String result,String comm){
		//获得报销单对象
		BizClaimVoucher bxd = this.findByBxdId(bxdid);
	    String sheet_type = "总经理审核类型单据";
		//设置审核类型(例如：部门经理审核，总经理审核，财务审核)
		String vType = "总经理审核";
		//判断审核结果
		if(result.equals("审核通过")){
			//状态：已审批；下一个处理人：财务
				bxd.setStatus("已审批");
				SysEmployee nextDealSe = empservice.findByPostionName("CW");
				bxd.setSysEmployeeByNextDealSn(nextDealSe);
		}else{
			if(result.equals("审核拒绝")){
				bxd.setStatus("拒绝");
				bxd.setSysEmployeeByNextDealSn(null);
			}else{//打回
				bxd.setStatus("打回");
				bxd.setSysEmployeeByNextDealSn(bxd.getSysEmployeeByCreateSn());
			}
		}
		//生成审核结果对象
		BizCheckResult res = new BizCheckResult(se, bxd, sheet_type, vType, result, comm);
		//保存相关对象
		this.getHibernateTemplate().update(bxd);
		this.getHibernateTemplate().save(res);
		return true;
	}
	
	public boolean spbxdFromCW(String bxdid,SysEmployee se,String result,String comm){
		//获得报销单对象
		BizClaimVoucher bxd = this.findByBxdId(bxdid);
		//获得报销单金额
		double bxdaccount = bxd.getTotalAcount();
		//判断报销单审核类型
		String sheet_type = "";
		if(bxdaccount <= 5000){
			sheet_type = "部门经理审核类型单据";
		}else{
			sheet_type = "总经理审核类型单据";
		}
		//设置审核类型(例如：部门经理审核，总经理审核，财务审核)
		String vType = "财务审核";
		//判断审核结果
		if(result.equals("审核通过")){
			//状态:付款；下一个处理人：null
				bxd.setStatus("付款");
				bxd.setSysEmployeeByNextDealSn(null);
		}else{
			if(result.equals("审核拒绝")){
				bxd.setStatus("拒绝");
				bxd.setSysEmployeeByNextDealSn(null);
			}else{//打回
				bxd.setStatus("打回");
				bxd.setSysEmployeeByNextDealSn(bxd.getSysEmployeeByCreateSn());
			}
		}
		//生成审核结果对象
		BizCheckResult res = new BizCheckResult(se, bxd, sheet_type, vType, result, comm);
		//生成财务单据对象
		BizAccount account = new BizAccount(se, bxd, "现金",bxd.getTotalAcount().intValue());
		//保存相关对象
		this.getHibernateTemplate().update(bxd);
		this.getHibernateTemplate().save(res);
		this.getHibernateTemplate().save(account);
		return true;		
	}
	
}

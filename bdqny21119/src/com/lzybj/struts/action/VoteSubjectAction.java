package com.lzybj.struts.action;

import java.util.List;

import com.lzybj.hibernate.domain.VoteOption;
import com.lzybj.hibernate.domain.VoteSubject;
import com.lzybj.hibernate.domain.VoteUser;
import com.lzybj.service.VoteItemService;
import com.lzybj.service.VoteOptionService;
import com.lzybj.service.VoteSubjectServcie;
import com.lzybj.service.VoteUserService;

public class VoteSubjectAction {
	private String vsid = "";
	private String[] viid = null;
	
	
	private List<VoteSubject> vss = null;
	private VoteSubject vsub = null;
	private List<VoteOption> voptions = null;
	private int usercount = 0;
	
	
	public String[] getViid() {
		return viid;
	}


	public void setViid(String[] viid) {
		this.viid = viid;
	}


	public String getVsid() {
		return vsid;
	}


	public void setVsid(String vsid) {
		this.vsid = vsid;
	}


	public VoteSubject getVsub() {
		return vsub;
	}


	public void setVsub(VoteSubject vsub) {
		this.vsub = vsub;
	}


	public List<VoteOption> getVoptions() {
		return voptions;
	}


	public void setVoptions(List<VoteOption> voptions) {
		this.voptions = voptions;
	}


	public int getUsercount() {
		return usercount;
	}


	public void setUsercount(int usercount) {
		this.usercount = usercount;
	}


	public List<VoteSubject> getVss() {
		return vss;
	}


	public void setVss(List<VoteSubject> vss) {
		this.vss = vss;
	}


	public String viewvotes(){
		VoteSubjectServcie myvs = new VoteSubjectServcie();
		this.setVss(myvs.findByAll());
		return "succ";
	}
	
	public String tpsubject(){
		VoteOptionService vos = new VoteOptionService();
		this.setVoptions(vos.findByVsid(vsid));
		VoteSubjectServcie myvs = new VoteSubjectServcie();
		this.setVsub(myvs.findByVsId(vsid));
		VoteUserService vus = new VoteUserService();
		this.setUsercount(vus.findByVsidUserCount(vsid));
		return "succ";
	}
	
	public String tp(){
		VoteItemService vis = new VoteItemService();
		VoteUser vu = new VoteUser(new Integer(1),"lzybj","qaz123");
		vis.submitvote(viid,vu);
		return "succ";
	}
}

package com.lzybj.struts.action;

import java.util.List;

import com.lzybj.hibernate.domain.VoteSubject;
import com.lzybj.hibernate.resobj.VoteTotalObj;
import com.lzybj.service.VoteItemService;
import com.lzybj.service.VoteSubjectServcie;
import com.lzybj.service.VoteUserService;

public class VoteItemAction {
	private String vsid = "";
	private List<VoteTotalObj> vto = null;
	private VoteSubject vsubject = null;
	private int vucount = 0;
	
	

	public VoteSubject getVsubject() {
		return vsubject;
	}

	public void setVsubject(VoteSubject vsubject) {
		this.vsubject = vsubject;
	}

	public int getVucount() {
		return vucount;
	}

	public void setVucount(int vucount) {
		this.vucount = vucount;
	}

	public String getVsid() {
		return vsid;
	}

	public void setVsid(String vsid) {
		this.vsid = vsid;
	}

	public List<VoteTotalObj> getVto() {
		return vto;
	}

	public void setVto(List<VoteTotalObj> vto) {
		this.vto = vto;
	}
	
	public String viewtotal(){
		VoteSubjectServcie vsubjectservice = new VoteSubjectServcie();
		this.setVsubject(vsubjectservice.findByVsId(vsid));
		VoteUserService vuserservice = new VoteUserService();
		this.setVucount(vuserservice.findByVsidUserCount(vsid));
		VoteItemService vis = new VoteItemService();
		this.setVto(vis.totalByVsid(vsid));
		return "succ";
	}
	
}

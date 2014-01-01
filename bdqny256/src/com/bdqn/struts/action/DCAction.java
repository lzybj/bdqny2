package com.bdqn.struts.action;

import com.bdqn.hibernate.domain.Diaocha;
import com.bdqn.service.DiaoChaService;

public class DCAction {
	private String[] ah = null;
	private String uname = "";
	public String[] getAh() {
		return ah;
	}
	public void setAh(String[] ah) {
		this.ah = ah;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String adddc(){
		/**
		 * 1.调用业务逻辑
		 * 2.获得结果
		 * 3.如果需要，共享结果集(request,session)
		 */
		DiaoChaService dcs = new DiaoChaService();
		Diaocha dc = null;
		/**
		 * 将爱好数组变为字符串
		 */
		String ahlist = "";
		for (int i = 0; i < ah.length; i++) {
			if(ahlist.equals("")){
				ahlist = ah[i];
			}else{
				ahlist = ah[i] + "," + ahlist;
			}
		}
		if(uname.equals("")){
			dc = new Diaocha(ahlist);
		}else{
			dc = new Diaocha(uname, ahlist);
		}
		boolean isSucc = dcs.addResult(dc);
		return "succ";
	}
	
}

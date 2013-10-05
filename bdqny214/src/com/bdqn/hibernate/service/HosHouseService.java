package com.bdqn.hibernate.service;

import java.util.List;

import com.bdqn.hibernate.factory.DAOFactory;
import com.bdqn.hibernate.res.HosResObj;

public class HosHouseService {
	public List<HosResObj> findByParam(String did,
			String sid,
			String htid,
			String dayu,
			String xiaoyu,
			String orderby,
			String uname){
		String param = "";
		String norderby = "";
		if(!did.equals("0")){
			param = param + " and hd.did = " + did;
		}
		if(!sid.equals("0")){
			param = param + " and hs.sid = " + sid;
		}
		if(!htid.equals("0")){
			param = param + " and ht.htid = " + htid;
		}
		if(!dayu.equals("") && !xiaoyu.equals("")){
			param = param + " and hh.price >= " + dayu + " and hh.price <= " + xiaoyu;
		}
		if(!uname.equals("")){
			param = param + " and su.uname like '%"+ uname +"%'";
		}
		if(orderby.equals("price asc")){
			norderby = "hh.price";
		}
		if(orderby.equals("price desc")){
			norderby = "hh.price desc";
		}
		if(orderby.equals("time asc")){
			norderby = "hh.htime";
		}
		if(orderby.equals("time desc")){
			norderby = "hh.htime desc";
		}
		return DAOFactory.getHouseDAO().selectMyParam(param, norderby);
	}
}

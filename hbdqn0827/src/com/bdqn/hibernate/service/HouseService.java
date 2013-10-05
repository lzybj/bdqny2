package com.bdqn.hibernate.service;

import java.util.List;

import com.bdqn.hibernate.dao.IHosHouseDAO;
import com.bdqn.hibernate.factory.DAOFactory;
import com.bdqn.hibernate.res.HosResObject;

public class HouseService {
	public List<HosResObject> findByParam(String did,String sid,
			String htid,String bprice,
			String eprice,String orderby,
			String uname){
		String param = "";
		String myOrderBy = "";
		if(!did.equals("0")){
			param = param + " and hd.did = " + did;
		}
		if(!sid.equals("0")){
			param = param + " and hs.sid = " + sid;
		}
		if(!htid.equals("0")){
			param = param + " and ht.htid = " + htid;
		}
		if(!bprice.equals("")){
			param = param + " and hh.price >= " + bprice;
		}
		if(!eprice.equals("")){
			param = param + " and hh.price <=" + eprice;
		}
		if(!uname.equals("")){
			param = param + " and su.uname like '%"+ uname +"%'";
		}
		if(orderby.equals("bprice")){
			myOrderBy = "order by hh.price";
		}
		if(orderby.equals("eprice")){
			myOrderBy = "order by hh.price desc";
		}
		if(orderby.equals("bhtime")){
			myOrderBy = "order by hh.htime desc";
		}
		if(orderby.equals("ehtime")){
			myOrderBy = "order by hh.htime";
		}
		IHosHouseDAO dao = DAOFactory.getHouseDAO();
		List<HosResObject> data = dao.selectParam(param,myOrderBy);
		return data;
	}
}

package com.bdqn.test;

import java.util.List;

import com.bdqn.hibernate.dao.IHosHouseDAO;
import com.bdqn.hibernate.factory.DAOFactory;
import com.bdqn.hibernate.res.HosResObj;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String param = "and hd.did = 1";
		String orderby = "hh.htime desc";
		IHosHouseDAO dao = DAOFactory.getHouseDAO();
		List<HosResObj> data = dao.selectMyParam(param, orderby);
		for (HosResObj hosResObj : data) {
			System.out.println(hosResObj.getUname() + "," + hosResObj.getHtime());
		}
	}

}

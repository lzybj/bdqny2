package com.bdqn.hibernate.dao;

import java.util.List;

import com.bdqn.hibernate.res.HosResObj;

public interface IHosHouseDAO {
	public List<HosResObj> selectMyParam(String param,String orderby);
}

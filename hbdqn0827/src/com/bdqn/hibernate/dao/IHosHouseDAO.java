package com.bdqn.hibernate.dao;

import java.util.List;

import com.bdqn.hibernate.res.HosResObject;

public interface IHosHouseDAO {
	public List<HosResObject> selectParam(String selParam,String orderBy);
}

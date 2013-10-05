package com.bdqn.hibernate.service;

import java.util.List;

import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.factory.DAOFactory;

public class HosTypeService {
	public List<HosType> findByAll(){
		return DAOFactory.getTypeDAO().selectAll();
	}
}

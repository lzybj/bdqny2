package com.bdqn.hibernate.service;

import java.util.List;

import com.bdqn.hibernate.domain.HosDistrict;
import com.bdqn.hibernate.factory.DAOFactory;

public class DistrictService {
	public List<HosDistrict> findByAll(){
		return DAOFactory.getDistrictDAO().selectAll();
	}
}

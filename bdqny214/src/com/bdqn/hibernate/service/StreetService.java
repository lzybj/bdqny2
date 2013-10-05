package com.bdqn.hibernate.service;

import java.util.List;

import com.bdqn.hibernate.domain.HosStreet;
import com.bdqn.hibernate.factory.DAOFactory;

public class StreetService {
	public List<HosStreet> findByDid(String did){
		return DAOFactory.getStreetDAO().selectByDid(did);
	}
}

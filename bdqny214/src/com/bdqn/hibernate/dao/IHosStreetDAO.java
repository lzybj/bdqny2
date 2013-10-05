package com.bdqn.hibernate.dao;

import java.util.List;

import com.bdqn.hibernate.domain.HosStreet;

public interface IHosStreetDAO {
	public List<HosStreet> selectByDid(String did);
}

package com.bdqn.hibernate.factory;

import com.bdqn.hibernate.dao.IHosDistrictDAO;
import com.bdqn.hibernate.dao.IHosHouseDAO;
import com.bdqn.hibernate.dao.IHosStreetDAO;
import com.bdqn.hibernate.dao.IHosTypeDAO;
import com.bdqn.hibernate.dao.imp.HosDistrictDAOImp;
import com.bdqn.hibernate.dao.imp.HosHouseDAOImp;
import com.bdqn.hibernate.dao.imp.HosStreetDAOImp;
import com.bdqn.hibernate.dao.imp.HosTypeDAOImp;

public class DAOFactory {
	public static IHosDistrictDAO getDistrictDAO(){
		return HosDistrictDAOImp.getInstance();
	}
	
	public static IHosStreetDAO getStreetDAO(){
		return HosStreetDAOImp.getInstance();
	}
	
	public static IHosTypeDAO getTypeDAO(){
		return HosTypeDAOImp.getInstance();
	}
	
	public static IHosHouseDAO getHouseDAO(){
		return HosHouseDAOImp.getInstance();
	}
}

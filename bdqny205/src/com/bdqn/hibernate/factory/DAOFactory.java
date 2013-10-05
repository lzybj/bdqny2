package com.bdqn.hibernate.factory;

import com.bdqn.hibernate.dao.IHtUsersDAO;
import com.bdqn.hibernate.dao.imp.HtUsersDAOImp;

public class DAOFactory {
	public static IHtUsersDAO getIHtUsersDAO(){
		return HtUsersDAOImp.getInstance();
	}
}

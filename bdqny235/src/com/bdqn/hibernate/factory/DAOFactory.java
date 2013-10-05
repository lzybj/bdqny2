package com.bdqn.hibernate.factory;

import com.bdqn.hibernate.dao.ISysUserDAO;
import com.bdqn.hibernate.dao.imp.SysUserDAOImp;

public class DAOFactory {
	public static ISysUserDAO getSysUserDAO(){
		return SysUserDAOImp.getInstance();
	}
}

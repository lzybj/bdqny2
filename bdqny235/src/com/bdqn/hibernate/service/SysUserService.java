package com.bdqn.hibernate.service;

import com.bdqn.hibernate.dao.ISysUserDAO;
import com.bdqn.hibernate.domain.SysUser;
import com.bdqn.hibernate.factory.DAOFactory;

public class SysUserService {
	public SysUser login(String uname,String upwd){
		ISysUserDAO mydao = DAOFactory.getSysUserDAO();
		SysUser myuser = mydao.findByUName(uname);
		if(myuser != null){
			if(myuser.getUpassword().equals(upwd)){
				return myuser;
			}			
		}
		return null;
	}
}

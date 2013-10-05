package com.bdqn.hibernate.service;

import com.bdqn.hibernate.dao.IHtUsersDAO;
import com.bdqn.hibernate.domain.HtUsers;
import com.bdqn.hibernate.factory.DAOFactory;

public class UsersService {
	/**
	 * 检查用户注册的用户名是否在数据库中已经存在
	 * @param uname
	 * @return true 不存在 false 存在
	 */
	public boolean checkUName(String uname){
		IHtUsersDAO mydao = DAOFactory.getIHtUsersDAO();
		HtUsers myuser = mydao.findByUName(uname);
		if(myuser != null){
			return false;
		}
		
		return true;
	}
}

package com.bdqn.hibernate.dao;

import com.bdqn.hibernate.domain.SysUser;

public interface ISysUserDAO {
	public SysUser findByUName(String uname);
}

package com.bdqn.hibernate.dao.imp;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.dao.ISysUserDAO;
import com.bdqn.hibernate.domain.SysUser;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class SysUserDAOImp implements ISysUserDAO{
	private SysUserDAOImp() {
		// TODO Auto-generated constructor stub
	}
	
	public static SysUserDAOImp getInstance(){
		return new SysUserDAOImp();
	}
	
	public SysUser findByUName(String uname) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		String hsql = "from SysUser su where su.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,uname);
		SysUser myuser = (SysUser)query.uniqueResult();
		HibernateSessionFactory.closeSession();
		return myuser;
	}
}

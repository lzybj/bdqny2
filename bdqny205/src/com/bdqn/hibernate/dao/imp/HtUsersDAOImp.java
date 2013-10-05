package com.bdqn.hibernate.dao.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.dao.IHtUsersDAO;
import com.bdqn.hibernate.domain.HtUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class HtUsersDAOImp implements IHtUsersDAO {
	private Session session = null;
	private Transaction t = null;
	private Query query = null;
	private String hsql = "";
	//私有化构造方法
	private HtUsersDAOImp(){

	}
	//通过静态方法获取实例
	public static HtUsersDAOImp getInstance(){
		return new HtUsersDAOImp();
	}
	

	public HtUsers findByUName(String uname) {
		// TODO Auto-generated method stub
		session = HibernateSessionFactory.getSession();
		hsql = "from HtUsers u where u.uname = ?";
		query = session.createQuery(hsql);
		query.setString(0,uname);
		HtUsers myuser = (HtUsers)query.uniqueResult();
		session.close();
		return myuser;
	}

	public boolean addHtUsers(HtUsers users) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<HtUsers> findByLikeUName(String uname) {
		// TODO Auto-generated method stub
		return null;
	}

}

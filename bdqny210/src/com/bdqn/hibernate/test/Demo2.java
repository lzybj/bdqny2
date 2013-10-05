package com.bdqn.hibernate.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 在现有用户下，去添加一个对应联系人
		 */
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		String hsql = "from TblUsers u where u.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"金鑫");
		TblUsers myuser = (TblUsers)query.uniqueResult();
		//创建联系人
		TblTxl lxr = new TblTxl(myuser, "马吉宁","12323434");
//		session.save(lxr);
		myuser.getTblTxls().add(lxr);
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

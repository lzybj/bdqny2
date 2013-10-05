package com.bdqn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 向用户和联系人表中同时插入记录
		 * 插入用户的同时，再创建此用户几个联系人
		 * 注意：此种方式适合于多对一的单向关联
		 */
//		Session session = HibernateSessionFactory.getSession();
//		Transaction t = session.beginTransaction();
//		t.begin();
//		//创建用户
//		TblUsers myuser = new TblUsers("老陈","qaz123");
//		//创建当前用户的联系人
//		TblTxl mylxr = new TblTxl(myuser,"张三","12345678");
//		TblTxl mylxr2 = new TblTxl(myuser,"李四","110");
//		//插入
//		session.save(myuser);
//		session.save(mylxr);
//		session.save(mylxr2);
//		t.commit();
//		HibernateSessionFactory.closeSession();
	}

}

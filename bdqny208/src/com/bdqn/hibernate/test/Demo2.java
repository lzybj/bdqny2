package com.bdqn.hibernate.test;

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
		 * 向用户和联系人表中同时插入记录
		 * 插入用户的同时，再创建此用户几个联系人
		 * 注意：此种方式用于一对多的单向关联
		 */
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		TblUsers myuser = new TblUsers("小庄","22222222");
		TblTxl king = new TblTxl("小金","111111");
		//king.setTblUsers(myuser);
		myuser.getTblTxls().add(king);
		TblTxl wang = new TblTxl("小王","111111");
		//wang.setTblUsers(myuser);
		myuser.getTblTxls().add(wang);
		session.save(myuser);
//		session.save(king);
//		session.save(wang);
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

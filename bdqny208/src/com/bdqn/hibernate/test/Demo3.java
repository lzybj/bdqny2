package com.bdqn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 向用户和联系人表中同时插入记录
		 * 插入用户的同时，再创建此用户几个联系人
		 * 注意：此种方式用于一对多的双向关联
		 */
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		/** 测试多对一插入成功！
		TblUsers myuser = new TblUsers("小张","234234");
		TblTxl xlr = new TblTxl(myuser,"小陈","345433425");
		TblTxl xlr2 = new TblTxl(myuser,"小刚","345433425");
		session.save(myuser);
		session.save(xlr);
		session.save(xlr2);
		**/
		/** 测试一对多插入成功！
		TblUsers myuser = new TblUsers("小张","234234");
		TblTxl xlr = new TblTxl("小陈","345433425");
		xlr.setTblUsers(myuser);
		TblTxl xlr2 = new TblTxl("小刚","345433425");
		xlr2.setTblUsers(myuser);
		myuser.getTblTxls().add(xlr);
		myuser.getTblTxls().add(xlr2);
		session.save(myuser);
		session.save(xlr);
		session.save(xlr2);
		**/
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

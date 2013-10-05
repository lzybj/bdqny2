package com.bdqn.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bdqn.hibernate.domain.TblUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//创建配置对象
//		Configuration conf = new Configuration().configure();
//		//生成SESSIONFACTORY
//		SessionFactory sessionFactory = conf.buildSessionFactory();
//		//获得session
//		Session session = sessionFactory.openSession();
//		//生成事务对象
//		Transaction t  = session.beginTransaction();
//		t.begin();
//		//insert操作
//		TblUsers myuser = new TblUsers("小岳","qaz123");
//		//保存
//		session.save(myuser);
//		t.commit();
//		//关闭SESSION
//		session.close();
//		System.out.println("成功！");
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		TblUsers myuser = new TblUsers("小小","qaz123");
		session.save(myuser);
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

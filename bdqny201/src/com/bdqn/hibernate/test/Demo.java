package com.bdqn.hibernate.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.hibernate.domain.HtUsers;
import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.hygj.security.MD5;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("请输入用户名");
		Scanner input = new Scanner(System.in);
		String uname = input.next();
		System.out.println("请输入密码：");
		String upwd = input.next();
		//密码加密
		MD5 md = new MD5();
		upwd = md.getMD5ofStr(upwd);
		HtUsers myUser = new HtUsers(uname,upwd);
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		Transaction t = session.beginTransaction();
		t.begin();
		//非查询操作(插入)
		session.save(myUser);
		t.commit();
		HibernateSessionFactory.closeSession();
	}

}

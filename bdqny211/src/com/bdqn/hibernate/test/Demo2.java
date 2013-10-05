package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.factory.HibernateSessionFactory;
import com.bdqn.hibernate.res.Resutx;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//查询老魏所有的联系人信息:(用户名,联系人,联系人电话)
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select u.uname,tx.txname,tx.txtel " +
				"from TblUsers u " +
				"inner join u.tblTxls tx " +
				"where u.uname = ?";//方法1
		hsql = "select new com.bdqn.hibernate.res.Resutx(u.uname,tx.txname,tx.txtel) " +
				"from TblUsers u " +
				"inner join u.tblTxls tx " +
				"where u.uname = ?";//方法2
		Query query = session.createQuery(hsql);
		query.setString(0,"老魏");
		//方法1,返回对象数组
//		List<Object[]> data = query.list();
//		for (Object[] objects : data) {
//			System.out.println(objects[0]);
//			System.out.println(objects[1]);
//			System.out.println(objects[2]);
//		}
		//方法2，创建结果对象(com.bdqn.hibernate.res.Resutx)
		List<Resutx> data = query.list();
		for (Resutx resutx : data) {
			System.out.println(resutx.getUname());
			System.out.println(resutx.getTxname());
			System.out.println(resutx.getTxtel());
		}
		HibernateSessionFactory.closeSession();
	}

}

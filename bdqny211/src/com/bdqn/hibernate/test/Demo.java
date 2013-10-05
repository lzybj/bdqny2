package com.bdqn.hibernate.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.bdqn.hibernate.domain.TblTxl;
import com.bdqn.hibernate.factory.HibernateSessionFactory;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//查询老魏所有的联系人信息(全部字段)
		Session session = HibernateSessionFactory.getSession();
		String hsql = "select tx " +
				"from TblUsers u " +
				"inner join u.tblTxls tx " +
				"where u.uname = ?";
		Query query = session.createQuery(hsql);
		query.setString(0,"老魏");
		List<TblTxl> lxrs = query.list();
		for (TblTxl tblTxl : lxrs) {
			System.out.println(tblTxl.getTxname());
			System.out.println(tblTxl.getTxtel());
			System.out.println(tblTxl.getCtime().toLocaleString());
		}
		HibernateSessionFactory.closeSession();
	}

}

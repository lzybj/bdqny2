package com.bdqn.hibernate.test;

import com.bdqn.hibernate.domain.Userinfo;
import com.bdqn.hibernate.service.UserInfoService;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfoService uis = new UserInfoService();
		Userinfo my = uis.findByUserid("id001");
		System.out.println(my.getBalance());
	}

}

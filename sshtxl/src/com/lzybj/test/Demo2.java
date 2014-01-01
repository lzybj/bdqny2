package com.lzybj.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzybj.hibernate.domain.Lxrs;
import com.lzybj.hibernate.domain.Users;
import com.lzybj.service.LxrsService;
import com.lzybj.service.UsersService;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		LxrsService lxrservice = (LxrsService)ac.getBean("lxrsservice");
		UsersService usersservice = (UsersService)ac.getBean("usersservice");
		Users myuser = usersservice.isLogin(new Users("lzybj","qaz123"));
	//	lxrservice.addLxr(myuser, new Lxrs("mjn","119119"));
		List<Lxrs> data = lxrservice.findByLxrName(myuser,"j");
		System.out.println(data.size());
	}

}

package com.bdqn.hibernate.test;

import com.hygj.security.MD5;

public class Demo2 {
	public static void main(String[] args) {
		MD5 md = new MD5();
		System.out.println(md.getMD5ofStr("qaz123"));
	}
}

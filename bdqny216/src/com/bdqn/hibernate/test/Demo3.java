package com.bdqn.hibernate.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer sb = new StringBuffer();
//		int i = 0;
//		while(i < 6){
//			Random rand = new Random();
//			int myInt = rand.nextInt(122);
//			if(myInt >= 65 && myInt <= 122){
//				char c = (char)myInt;
//				sb.append(c);
//				i++;
//			}
//		}
//		System.out.println(sb);
//		Date now = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//		String nowStr = sdf.format(now);
//		System.out.println(nowStr);
		String str = "";
		for (int i = 0; i < 8; i++) {
			str = str + (int)(Math.random()*10);
		}
		System.out.println(str);
	}

}

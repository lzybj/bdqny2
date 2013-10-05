package com.bdqn.test;

import java.util.List;

import com.bdqn.domain.Student;
import com.bdqn.service.StudentServcie;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		StudentServcie ss = new StudentServcie();
		List<Student> data = ss.findByStuAge(19);
		for (Student student : data) {
			System.out.println(student.getStuid() + "," + student.getStuname() + "," + student.getStuage());
		}
	}

}

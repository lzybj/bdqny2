package com.bdqn.service;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.bdqn.domain.Student;

public class StudentServcie {
	public List<Student> findByStuAge(int selAge) throws Exception{
		List<Student> data = new ArrayList<Student>();
		SAXReader sax = new SAXReader();
		Document doc = sax.read("src/myconfig.xml");
		Element root = doc.getRootElement();
		List<Element> studentList = root.elements("student");
		for (Element student : studentList) {
			String stuAge = student.elementText("student-age");
			if(Integer.parseInt(stuAge) > selAge){
				String stuid = student.attributeValue("stuid");
				String stuname = student.elementText("student-name");
				Student mystu = new Student(Integer.parseInt(stuid), stuname,Integer.parseInt(stuAge));
				data.add(mystu);
			}
		}
		return data;
	}
}

package com.bdqn.test;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Demo {

	/**
	 * @param args
	 * @throws DocumentException 
	 */
	public static void main(String[] args) throws DocumentException {
		// TODO Auto-generated method stub
		SAXReader sax = new SAXReader();
		Document doc = sax.read("src/myconfig.xml");
		Element root = doc.getRootElement();
		List<Element> studentList = root.elements("student");
		for (Element student : studentList) {
			//获得student标签属性
			System.out.println(student.attributeValue("stuid"));
			//获得student标签下的子标签student-name
			Element studentName = student.element("student-name");
			//获得其文本值
			System.out.println(studentName.getText());
			String studentAge = student.elementText("student-age");
			System.out.println(studentAge);
//			Element studentAge = student.element("student-age");
//			System.out.println(studentAge.getText());
		}
	}

}

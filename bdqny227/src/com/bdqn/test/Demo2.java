package com.bdqn.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse("src/mystruts.xml");
		NodeList nodes = doc.getElementsByTagName("action");
		for(int i = 0;i < nodes.getLength();i++){
			Element element = (Element)nodes.item(i);
			System.out.println(element.getAttribute("name"));
		}
	}

}

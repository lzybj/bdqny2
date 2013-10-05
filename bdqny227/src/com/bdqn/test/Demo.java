package com.bdqn.test;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SAXReader saxReader = new SAXReader();
		Document doc = saxReader.read("src/mystruts.xml");
		List<Element> actions = doc.selectNodes("mystruts/actions/action");
		for (Element element : actions) {
			List<Element> res = element.selectNodes("result");
			System.out.println(res);
			System.out.println(res.size());
			for (Element element2 : res) {
				System.out.println(element2.getText());
			}
		}
//		Element root = doc.getRootElement();
//		Element actions = root.element("actions");
//		List<Element> actionList = actions.elements("action");
//		for (Element element : actionList) {
//			System.out.println(element.attributeValue("name"));
//			System.out.println(element.attributeValue("class"));
//			List<Element> results = element.elements("result");
//			for (Element element2 : results) {
//				System.out.println(element2.attributeValue("name") + "," + element2.getText());
//			}
//		}
	}

}

package com.bdqn.freamwork.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.bdqn.freamwork.action.ActionMapping;
import com.bdqn.freamwork.action.Result;

public class ActionMappingManager {
	public static Map<String,ActionMapping> mappings = new HashMap<String, ActionMapping>();
	//解析xml配置文件
	public void init(String configName){
		SAXReader sax = new SAXReader();
		String xmlUrl = this.getClass().getClassLoader().getResource(configName).getPath();
		try {
			Document doc = sax.read(xmlUrl);
			Element root = doc.getRootElement();
			Element actions = root.element("actions");
			List<Element> actionList = actions.elements("action");
			for (Element element : actionList) {
				String name = element.attributeValue("name");
				String className = element.attributeValue("class");
				Map<String,Result> results = new HashMap<String, Result>();
				List<Element> resList = element.elements("result");
				for (Element element2 : resList) {
					String resName = element2.attributeValue("name");
					String resRedirect = element2.attributeValue("redirect");
					boolean redirect = false;
					if(resRedirect != null){
						if(resRedirect.equals("true")){
							redirect = true;
						}
					}
					String value = element2.getText();
					Result myRes = new Result(resName, value, redirect);
					results.put(resName, myRes);
				}
				mappings.put(name,new ActionMapping(name, className, results));
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//例如：configs的值为:mystruts-xxp,mystruts-jx,mystruts-xxd
	public ActionMappingManager(String[] configs){
		for (String configName : configs) {
			init(configName);
		}
	}
	
	public static ActionMapping getActionMapping(String name){
		System.out.println(mappings.size());
		ActionMapping mapping = mappings.get(name);
		return mapping;
	}
}

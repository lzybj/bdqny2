package com.bdqn.mystruts.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.bdqn.mystruts.action.ActionMapping;
import com.bdqn.mystruts.action.ActionResult;

/**
 * 1.解析xml配置文件(dom4j)
 * 
 * 2.获得一个ActionMapping的实例
 * @author lzybj
 *
 */
public class ActionMappingManager {
	public static Map<String,ActionMapping> mappings = new HashMap<String, ActionMapping>();
	
	private void init(String configName) throws DocumentException{
		SAXReader sax = new SAXReader();
		String xmlPath = this.getClass().getClassLoader().getResource(configName).getPath();
		Document doc = sax.read(xmlPath);
		//获得根节点
		Element root = doc.getRootElement();
		//在ROOT节点下获得actions节点
		Element actions = root.element("actions");
		//在actions节点下获得action节点集合
		List<Element> actionList = actions.elements("action");
		//遍历节点集合获得每一个action节点
		for (Element action : actionList) {
			//获得action两个属性name,class
			String name = action.attributeValue("name");
			String className = action.attributeValue("class");
			//定义一个reulst的Map集合
			Map<String,ActionResult> results = new HashMap<String, ActionResult>();
			//在action节点下获得reulst节点集合
			List<Element> resultList = action.elements("result");
			//遍历result节点集合获得每一个result节点
			for (Element result : resultList) {
				//获得result节点的两个属性name,redirect
				String resName = result.attributeValue("name");
				String resRedirect = result.attributeValue("redirect");
				boolean redirect = false;
				if(resRedirect != null){
					if(resRedirect.equals("true")){
						redirect = true;
					}
				}
				//获得result节点文本节点值
				String resValue = result.getText();
				//生成ActionResult对象
				ActionResult myres = new ActionResult(resName, resValue, redirect);
				results.put(resName,myres);
			}//遍历result节点集合结束
			//生成ActionMapping对象
			ActionMapping mapping = new ActionMapping(name, className, results);
			mappings.put(name, mapping);			
		}//遍历action结束
	}//解析xml方法结束
	
	public ActionMappingManager(String[] configNames){
		for (String configName : configNames) {
			try {
				init(configName);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	public static ActionMapping getActionMapping(String name){
		return (ActionMapping)mappings.get(name);
	}
	
}

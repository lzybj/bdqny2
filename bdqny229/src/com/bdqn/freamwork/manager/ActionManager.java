package com.bdqn.freamwork.manager;

import com.bdqn.freamwork.action.Action;

/**
 * 通过类路径字符串，返回一个Action对象
 * 利用java反射机制
 * @author lzybj
 *
 */
public class ActionManager {
	public static Action createAction(String classForName){
		Action action = null;
		try {
			action = (Action)loadClass(classForName).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return action;
	}
	
	public static Class loadClass(String classForName) {
		Class myclass = null;
		try {
			myclass = Thread.currentThread().getContextClassLoader().loadClass(classForName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(myclass == null){//该类在线程没有实例对象，即没有被实例过
			try {
				myclass = Class.forName(classForName);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return myclass;
	}
}

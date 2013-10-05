package com.bdqn.mystruts.manager;

import com.bdqn.mystruts.action.Action;

/**
 * 通过JAVA反射机制根据mystruts.xml中class字符串，获得对应ACTION类
 * @author lzybj
 *
 */
public class ActionManager {
	public static Action createAction(String classForName){
		Action myAction = null;
		try {
			myAction = (Action)loadClass(classForName).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return myAction;
	}
	public static Class loadClass(String classForName){
		Class myClass = null;
		//第一从当前线程中查看是否有Action类型
		try {
			myClass = Thread.currentThread().getContextClassLoader().loadClass(classForName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//如果在当前线程没有该class，则通过Class.forName方法获得
		if(myClass == null){
			try {
				myClass = Class.forName(classForName);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return myClass;
	}
}

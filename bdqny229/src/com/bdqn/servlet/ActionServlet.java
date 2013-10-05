package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.freamwork.action.Action;
import com.bdqn.freamwork.action.ActionMapping;
import com.bdqn.freamwork.action.Result;
import com.bdqn.freamwork.manager.ActionManager;
import com.bdqn.freamwork.manager.ActionMappingManager;
import com.bdqn.myaction.LoginAction;
import com.bdqn.myaction.RegisterAction;

public class ActionServlet extends HttpServlet {
	private static Map<String,ActionMapping> mappings = new HashMap<String, ActionMapping>();

	/**
	 * Constructor of the object.
	 */
	public ActionServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String[] arr = uri.split("/");
		String myactionname = arr[arr.length - 1];
		myactionname = myactionname.substring(0,myactionname.length() - 3);
		Action action = null;
		ActionMapping mapping = ActionMappingManager.getActionMapping(myactionname);
		action = ActionManager.createAction(mapping.getClassName());
		String urlName = action.execute(request);
		Result res = mapping.getResults().get(urlName);
		if(res.isRedirect()){
			response.sendRedirect(res.getValue());
		}else{
			request.getRequestDispatcher(res.getValue()).forward(request, response);
		}
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		String configs = this.getInitParameter("configs");
		String[] configsArr = {""};
		if(configs == null){
			configsArr[0] = "mystruts.xml";
		}else{
			if(configs.indexOf(",") != -1){
				configsArr = configs.split(",");
			}else{
				configsArr[0] = configs;
			}			
		}
		ActionMappingManager amm = new ActionMappingManager(configsArr);
	}

}

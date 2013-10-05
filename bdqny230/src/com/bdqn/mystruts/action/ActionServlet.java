package com.bdqn.mystruts.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.mystruts.manager.ActionManager;
import com.bdqn.mystruts.manager.ActionMappingManager;

public class ActionServlet extends HttpServlet {
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
		/**
		 * 1.获得name地址 login.do
		 * 2.获得ActionMapping
		 * 3.获得Action
		 * 4.执行Action中execute方法
		 * 5.转发或重定向
		 */
		String uri = request.getRequestURI();
		String[] arr = uri.split("/");
		String myactionname = arr[arr.length - 1];
		myactionname = myactionname.substring(0,myactionname.length() - 3);
		ActionMapping mapping = ActionMappingManager.getActionMapping(myactionname);
		Action action = ActionManager.createAction(mapping.getClassName());
		String logicUrl = action.execute(request);
		Map<String,ActionResult> results = mapping.getResults();
		ActionResult result = results.get(logicUrl);
		if(result.isRedirect()){
			response.sendRedirect(result.getValue());
		}else{
			request.getRequestDispatcher(result.getValue()).forward(request,response);
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
		// Put your code here
		//加载配置文件信息到ActionMappingManager
		String configs = this.getInitParameter("configs");
		if(configs == null){
			String[] configNames = {"mystruts.xml"};
			ActionMappingManager amm = new ActionMappingManager(configNames);
		}else{
			String[] configNames = configs.split(",");
			ActionMappingManager amm = new ActionMappingManager(configNames);			
		}
	}

}

package com.bdqn.hibernate.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bdqn.hibernate.domain.Userinfo;
import com.bdqn.hibernate.service.UserInfoService;

public class CXAction extends HttpServlet {

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
		 * 1.解析请求参数
		 * 2.调用业务逻辑
		 * 3.获得结果
		 * 4.将其放入某个共享区间
		 * 5.转发或重定向
		 */
		String userid = request.getParameter("userid");
		UserInfoService uis = new UserInfoService();
		Userinfo myuser = uis.findByUserid(userid);
		HttpSession session = request.getSession();
		if(myuser == null){
			response.sendRedirect("fail.jsp");
		}else{
			session.setAttribute("myuser",myuser);
			if(myuser.getBalance().floatValue() < 0){
				request.getRequestDispatcher("res.jsp").forward(request, response);
			}else{
				if(myuser.getBalance().floatValue() < 100000){
					request.getRequestDispatcher("res2.jsp").forward(request, response);
				}else{
					request.getRequestDispatcher("res3.jsp").forward(request, response);
				}
			}
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
	}

}

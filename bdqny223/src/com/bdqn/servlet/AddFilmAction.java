package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bdqn.hibernate.servlce.FilmInfoService;

public class AddFilmAction extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddFilmAction() {
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
		request.setCharacterEncoding("UTF-8");
		String filmname = request.getParameter("filmname");
		String typeid = request.getParameter("typeid");
		String actor = request.getParameter("actor");
		String director = request.getParameter("director");
		String ticketprice = request.getParameter("ticketprice");
		FilmInfoService fis = new FilmInfoService();
		boolean isOk = fis.addFilmInfo(filmname, typeid, actor, director, ticketprice);
		if(isOk){
			response.sendRedirect("cx.jsp");
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("errmsg","1");
			response.sendRedirect("fabu.jsp");
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

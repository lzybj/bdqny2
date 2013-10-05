package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bdqn.hibernate.dao.IHosDistrictDAO;
import com.bdqn.hibernate.domain.HosDistrict;
import com.bdqn.hibernate.domain.HosType;
import com.bdqn.hibernate.service.DistrictService;
import com.bdqn.hibernate.service.TypeService;

public class GetDistrictAction extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public GetDistrictAction() {
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
		DistrictService ds = new DistrictService();
		List<HosDistrict> data = ds.findByAll();
		TypeService ts = new TypeService();
		List<HosType> data2 = ts.findByAll();
		HttpSession session = request.getSession();
		session.setAttribute("districts",data);
		session.setAttribute("types",data2);
		response.sendRedirect("cx.jsp");
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

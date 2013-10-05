package com.bdqn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bdqn.hibernate.domain.HosStreet;
import com.bdqn.hibernate.service.StreetService;

public class GetStreetXML extends HttpServlet {

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
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml");
		
		/**
		 * 1.解析请求，获得DID
		 * 2.调用业务逻辑获得所有街道
		 * 3.响应为XML
		 */
		String did = request.getParameter("did");
		PrintWriter out = response.getWriter();
		if(!did.equals("0")){
		StreetService ss = new StreetService();
		List<HosStreet> data = ss.findByDid(did);
		out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.println("<streets>");
	    out.println("<street>");
		out.println("<sid>0</sid>");
		out.println("<sname>全部</sname>");
		out.println("</street>");
		for (HosStreet hosStreet : data) {
			out.println("<street>");
			out.println("<sid>"+ hosStreet.getSid() +"</sid>");
			out.println("<sname>"+ hosStreet.getSname() +"</sname>");
			out.println("</street>");
		}
		out.println("</streets>");
		}else{
			out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			out.println("<streets>");
		    out.println("<street>");
			out.println("<sid>0</sid>");
			out.println("<sname>全部</sname>");
			out.println("</street>");
			out.println("</streets>");			
		}
		out.flush();
		out.close();
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

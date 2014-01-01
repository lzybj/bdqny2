/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.lzybj.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.lzybj.service.CustomersService;
import com.lzybj.struts.form.RegActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-10-2013
 * 
 * XDoclet definition:
 * @struts.action path="/reg" name="regActionForm" scope="request"
 */
public class RegAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		RegActionForm regActionForm = (RegActionForm) form;// TODO Auto-generated method stub
		CustomersService cs = new CustomersService();
		boolean isSucc =cs.addCustomer(regActionForm.getUname(),regActionForm.getUpwd());
		return mapping.findForward("succ");
	}
}
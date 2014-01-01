package com.lzybj.struts.action;

import java.math.BigDecimal;

import com.lzybj.hibernate.domain.Orderdetails;
import com.lzybj.hibernate.domain.Orders;
import com.lzybj.hibernate.domain.Products;
import com.lzybj.service.ProductsService;
import com.opensymphony.xwork2.ActionContext;

public class OrderDetailsAction {
	private String prodid = "";
	private String prodcount = "";
	
	private ProductsService ps = null;
	
	
	
	public ProductsService getPs() {
		return ps;
	}
	public void setPs(ProductsService ps) {
		this.ps = ps;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getProdcount() {
		return prodcount;
	}
	public void setProdcount(String prodcount) {
		this.prodcount = prodcount;
	}
	
	public String createorderdetails(){
		//根据产品ID获得产品对象
		Products p = ps.findByProdid(prodid);
		//从SESSION中获得订单对象
		Orders myorder = (Orders)ActionContext.getContext().getSession().get("temporder");
		//创建订单明细对象
		Orderdetails od = new Orderdetails(myorder,p,new BigDecimal(prodcount));
		//将订单明细对象添加到订单对象
		myorder.getOrderdetailses().add(od);
		//将订单对象保存到SESSION中
		ActionContext.getContext().getSession().put("temporder",myorder);
		return "succ";
	}
	
}

package com.bdqn.hibernate.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private String frucode;
	private BigDecimal bianma;
	private String xinghao;
	private String cname;
	private BigDecimal unitprice;
	private Date ctime;
	private String xname;
	private Date ftime;
	private BigDecimal fprice;
	private Date bxtime;
	private String content;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(String frucode, BigDecimal bianma, String xinghao,
			String cname, BigDecimal unitprice, Date ctime) {
		this.frucode = frucode;
		this.bianma = bianma;
		this.xinghao = xinghao;
		this.cname = cname;
		this.unitprice = unitprice;
		this.ctime = ctime;
	}

	/** full constructor */
	public Product(String frucode, BigDecimal bianma, String xinghao,
			String cname, BigDecimal unitprice, Date ctime, String xname,
			Date ftime, BigDecimal fprice, Date bxtime, String content) {
		this.frucode = frucode;
		this.bianma = bianma;
		this.xinghao = xinghao;
		this.cname = cname;
		this.unitprice = unitprice;
		this.ctime = ctime;
		this.xname = xname;
		this.ftime = ftime;
		this.fprice = fprice;
		this.bxtime = bxtime;
		this.content = content;
	}

	// Property accessors

	public String getFrucode() {
		return this.frucode;
	}

	public void setFrucode(String frucode) {
		this.frucode = frucode;
	}

	public BigDecimal getBianma() {
		return this.bianma;
	}

	public void setBianma(BigDecimal bianma) {
		this.bianma = bianma;
	}

	public String getXinghao() {
		return this.xinghao;
	}

	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public BigDecimal getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(BigDecimal unitprice) {
		this.unitprice = unitprice;
	}

	public Date getCtime() {
		return this.ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public String getXname() {
		return this.xname;
	}

	public void setXname(String xname) {
		this.xname = xname;
	}

	public Date getFtime() {
		return this.ftime;
	}

	public void setFtime(Date ftime) {
		this.ftime = ftime;
	}

	public BigDecimal getFprice() {
		return this.fprice;
	}

	public void setFprice(BigDecimal fprice) {
		this.fprice = fprice;
	}

	public Date getBxtime() {
		return this.bxtime;
	}

	public void setBxtime(Date bxtime) {
		this.bxtime = bxtime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
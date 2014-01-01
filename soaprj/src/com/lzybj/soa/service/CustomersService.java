package com.lzybj.soa.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Query;
import org.hibernate.Session;

import com.lzybj.hibernate.domain.Customers;
import com.lzybj.hibernate.factory.HibernateSessionFactory;

@Path("myservice")
public class CustomersService {
	
	@GET
	@Path("test")
	@Produces(MediaType.TEXT_HTML)
	public String test(){
		return "hello rest";
	}
	
	
	@GET
	@Path("islogin/{uname},{upwd}")
	@Produces(MediaType.TEXT_HTML)
	public String isLogin(@PathParam("uname") String cname,@PathParam("upwd") String cpwd){
		if(cname.equals("lzybj") && cpwd.equals("qaz123")){
			return "ok";
		}
		return "fail";
	}
	
	@GET
	@Path("findbyall")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Customers> findByAll(){
		String hsql = "from Customers";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		List<Customers> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}
	
	@GET
	@Path("findbycname/{cname}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Customers> findByCName(@PathParam("cname") String cname){
		String hsql = "from Customers c where c.cname like ?";
		Session session = HibernateSessionFactory.getSession();
		Query query = session.createQuery(hsql);
		query.setString(0, "%" + cname + "%");
		List<Customers> data = query.list();
		HibernateSessionFactory.closeSession();
		return data;
	}
	
	
}

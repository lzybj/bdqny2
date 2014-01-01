package com.lzybj.service;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.Invocation;
//import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
//import org.dom4j.Document;
//import org.dom4j.Element;
//import org.dom4j.io.SAXReader;

import com.lzybj.domain.Customers;

public class CustomersService {
	/**
	public List<Customers> findByCNameFromWS(String cname){
		List<Customers> data = new ArrayList<Customers>();
		//µ÷ÓÃwebservice
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/soaprj/services");
		WebTarget resource = target.path("myservice");
		WebTarget findbycnameService = resource.path("findbycname/" + cname);
		Invocation.Builder builder = findbycnameService.request(MediaType.APPLICATION_XML);
		Response response = builder.get();
		String xmlStr = response.readEntity(String.class);
		SAXReader sax = new SAXReader();
		try {
			Document doc = sax.read(new ByteArrayInputStream(xmlStr.getBytes()));
			Element root = doc.getRootElement();
			List<Element> customersList = root.elements("customers");
			for (Element customer : customersList) {
				data.add(new Customers(
						Integer.parseInt(customer.elementText("cid"))
						,customer.elementText("cname")
						,customer.elementText("cpwd")));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return data;
	}
	**/
}

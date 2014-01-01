package com.lzybj.test;

import java.io.ByteArrayInputStream;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Demo3 {
	public static void main(String[] args) throws Exception {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/soaprj/services");
		WebTarget resource = target.path("myservice");
		WebTarget findbycnameService = resource.path("findbycname/l");
		Invocation.Builder builder = findbycnameService.request(MediaType.APPLICATION_XML);
		Response response = builder.get();
		String xmlStr = response.readEntity(String.class);
		System.out.println(xmlStr);
		//解析字符串形式的xml
		SAXReader sax = new SAXReader();
		//获得Document对象
		Document doc = sax.read(new ByteArrayInputStream(xmlStr.getBytes()));
		//获得根节点元素
		Element root = doc.getRootElement();
		//获得customers元素集合
		List<Element> customersList = root.elements("customers");
		//遍历集合获得某一个元素
		for (Element customers : customersList) {
			System.out.println(customers.elementText("cid"));
			System.out.println(customers.elementText("cname"));
			System.out.println(customers.elementText("cpwd"));
		}
	}
}

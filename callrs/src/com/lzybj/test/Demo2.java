package com.lzybj.test;

import java.util.Collection;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lzybj.domain.Customers;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/soaprj/services");
		WebTarget resource = target.path("myservice");
		WebTarget findByAllService = resource.path("findbyall");
		Invocation.Builder build = findByAllService.request(MediaType.APPLICATION_JSON);
		Response response = build.get();
		String jsonStr = response.readEntity(String.class);
		System.out.println(jsonStr);
		//将Json串变为JSON对象
		JSONObject json = JSONObject.fromObject(jsonStr);
		//将JSON串中的JSON数组串取出
		JSONArray jsonArr = json.getJSONArray("customers");
		//将JSON数组对象变为集合对象
		Collection<Customers> data = jsonArr.toCollection(jsonArr,Customers.class);
		for (Customers customers : data) {
			System.out.println(customers.getCname());
		}
	}

}

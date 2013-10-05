package com.lzybj.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyInvocation.Builder;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		WebTarget tag = client.target("http://localhost:8080/myrest/services");
		WebTarget resource = tag.path("usersservice");
		WebTarget loginService = resource.path("login/zhengbo,qaz123");//.queryParam("username","zhengbo","password","qaz123");
		Invocation.Builder inbuilder = loginService.request(MediaType.TEXT_HTML);
		Response response = inbuilder.get();
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
//		Client client = ClientBuilder.newClient();
//		WebTarget resource = client.target("http://localhost:8080/myrest/services/").path("usersservice");
	}

}

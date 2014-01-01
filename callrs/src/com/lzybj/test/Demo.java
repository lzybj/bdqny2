package com.lzybj.test;

import java.util.Scanner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//生成Client对象
		Client client = ClientBuilder.newClient();
		//目前对象WebTarget,webservice地址
		WebTarget target = client.target("http://localhost:8080/soaprj/services");
		//webservice类
		WebTarget resource = target.path("myservice");
		//webservice类的方法
//		WebTarget testService = resource.path("test");
		WebTarget testService = resource.path("islogin/lzybj,qaz123");
		//响应类型(MediaType类型)
		Invocation.Builder build = testService.request(MediaType.TEXT_HTML_TYPE);
		//获取响应对象
		Response response = build.get();
		//解析响应之响应状态码
		System.out.println(response.getStatus());
		//解析响应之内容
		String myContent = response.readEntity(String.class);
		System.out.println(myContent);
	}

}

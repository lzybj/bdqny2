package com.lyzbj.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lyzbj.domain.Users;

@Path("usersservice")
public class UsersService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String tt(){
		return "OK";
	}
//	@GET
//	@Path("login")
//	@Produces(MediaType.TEXT_HTML)
//	public String login(){
//		return "NO";
//	}	
	
	@GET
	@Path("login/{username},{password}")
	@Produces(MediaType.TEXT_HTML)
	public String login(@PathParam("username") String userName,@PathParam("password") String passWord){
		if(userName.equals("zhengbo") && passWord.equals("qaz123")){
			return "OK";
		}
		return "NO";
	}
	@GET
	@Path("findbyall")
//	@Produces({MediaType.APPLICATION_JSON})	
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})	
	public List<Users> findByAll(){
		List<Users> data = new ArrayList<Users>();
		Users myUser = new Users();
		myUser.setUsid(1);
		myUser.setUserName("zhengbo");
		myUser.setPassWord("qaz123");
		Users myUser2 = new Users();
		myUser2.setUsid(2);
		myUser2.setUserName("lzybj");
		myUser2.setPassWord("040812");		
		data.add(myUser);
		data.add(myUser2);
		return data;
	}
}

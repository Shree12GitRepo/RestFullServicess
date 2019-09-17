package com.nt.resourcess;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentRegistration {
	@POST
	@Path("/regStudent")
	public Response registerStudent(@FormParam("uname") String uname,@FormParam("pwd") String pwd) {
		System.out.println("********registerStudent()***********");
		System.out.println("UserName::"+uname);
		System.out.println("Password::"+pwd);
		String response="SuccessFully Added UserDetails, name: "+uname;
		return Response.status(200).entity(response).build();
	}

}

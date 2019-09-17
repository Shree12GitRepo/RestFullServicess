package com.nt.resourcess;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import com.nt.model.UserStudent;

@Path("/student2")
public class StudentRegistration2 {
	@POST
	@Path("/regStudent2")
	public Response registerStudent(@BeanParam UserStudent stud) {
		System.out.println("********registerStudent()***********");
		System.out.println(stud);
		String response="SuccessFully Added UserDetails";
		return Response.status(200).entity(response).build();
	}
	
	@GET
	@Path("/headerparam")
	public Response headerParam(@HeaderParam("user-agent") String userAgengt) {
		return Response.status(200).entity("Address is Called "+userAgengt).build();
	}
	
	@GET
	@Path("/allheader")
	public Response allHttpHeaders(@Context HttpHeaders header) {
		for(String hdr:header.getRequestHeaders().keySet()) {
			System.out.println(hdr);
		}
		
		return Response.status(200).entity("All Header Displayed SuccessFully").build();
	}

}

package com.nt.model;

import javax.ws.rs.FormParam;

public class UserStudent {
	@FormParam("uname")
	private String uname;
	@FormParam("pwd")
	private String pwd;
	
	public UserStudent() {
		System.out.println("**********UserStudent::0-Param************");
	}
	
	@Override
	public String toString() {
		return "UserStudent [uname=" + uname + ", pwd=" + pwd + "]";
	}

}

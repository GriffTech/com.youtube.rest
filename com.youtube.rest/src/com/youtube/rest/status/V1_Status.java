package com.youtube.rest.status;

import javax.ws.rs.core.MediaType;

import javax.ws.rs.*;


@Path("/v1/status") //removed * wildcard to make this more compatible with tomcat
public class V1_Status {

	//private static final String api_version = "00.02.00"; //version of the api
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p>Java Web Service</p>";
	}
	

	
}

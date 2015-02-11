package com.youtube.rest.status;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.*;


@Path("/v1/status/") //removed * wildcard to make this more compatible with tomcat & glassfish
public class V1_Status {

	private static final String api_version = "00.02.00"; //version of the api
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle() {
		return "<p><b>My First Java Web Service</b></p>";
	}
	
	@Path("/version") 
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnVersion() {
		
		return "<b>Version: </b>"+ api_version;
	}
	
	@Path("/details") 
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnDetails() {
		return "<p><b>These are the main details</b></p>";
	}
	
	@Path("/otherdetails") 
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnOtherDetails() {
		return "<p><b>These are the other details</b></p>";
	}
	
}

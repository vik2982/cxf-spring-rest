package com.va.cxf.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/additionservice")
public interface AdditionService {
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	@Path("{val1}/{val2}")
	public Response add(@PathParam("val1") int valueOne,
						@PathParam("val2") int valueTwo);
}

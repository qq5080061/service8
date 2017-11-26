package com.service.service8.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2017-11-26T12:04:24.532Z")


@RestSchema(schemaId = "service8")
@Path("/service8")

@Produces({ "application/json" })
public class Service8Impl  {

    @Autowired
    private Service8Delegate service8Delegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return service8Delegate.helloworld(name);
    }
}


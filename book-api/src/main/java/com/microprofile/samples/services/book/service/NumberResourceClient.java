package com.microprofile.samples.services.book.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Dependent
@RegisterRestClient
@Path("numbers")
@Produces(MediaType.TEXT_PLAIN)
public interface NumberResourceClient {

    @GET
    @Path("generate")
    Response generate();
}

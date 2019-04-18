package com.microprofile.samples.services.book.resource;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.opentracing.Traced;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

@ApplicationScoped
@Path("env")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
@Traced
public class EnvironmentResource {
    @Inject
    @ConfigProperty(name = "env", defaultValue = "local")
    private String env;

    @GET
    @Produces(TEXT_PLAIN)
    public Response getEnv() {
//        final Config config = ConfigProvider.getConfig();
//        String env = config.getValue("env", String.class);
        return Response.ok(this.env).build();
    }
}

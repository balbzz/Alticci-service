package org.acme.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.service.AlticciService;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
    @Inject
    AlticciService alticciService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{n}")
    public long getAlticci(@PathParam("n") int n) {
        return alticciService.calculateAlticci(n);
    }

}

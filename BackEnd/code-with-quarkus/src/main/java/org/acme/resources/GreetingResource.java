package org.acme.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.service.AlticciService;

import org.eclipse.microprofile.openapi.annotations.Operation;

import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;



@Path("/alticci")
public class    GreetingResource {

    @Inject
    AlticciService alticciService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Operation(summary = "Get a greeting", description = "Get a simple greeting message.")
    public String hello() {
        return "Welcome to AlticciCalculator";
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{n}")
    @Operation(summary = "Calculate Alticci value", description = "Calculate the Alticci value for the given index.")
    @APIResponse(responseCode = "200", description = "Successful calculation",
            content = @Content(mediaType = "text/plain",
                    schema = @Schema(implementation = Long.class)))
    @APIResponse(responseCode = "400", description = "Invalid input")
    public long getAlticci(@Parameter(description = "Index of the Alticci sequence", required = true)@PathParam("n") int n) {
        return alticciService.calculateAlticciAlternitive(n);
    }

}

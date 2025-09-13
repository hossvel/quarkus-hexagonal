package com.hossvel.adapter.in.rest;

import com.hossvel.aplication.dto.AuthorRequestDTO;
import com.hossvel.aplication.port.in.IAuthorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

@Tag(name = "Authors", description = "Everything about your Authors")
public class AuthorResource {

    @Inject
    IAuthorService iAuthorService;

    @GET
    @Operation(summary = "Get all authors", description = "Returns a list of all authors")
    @APIResponse(responseCode = "200", description = "List of authors")
    public Response getAll() {

        return Response.status(Response.Status.CREATED).entity(iAuthorService.getAllAuthors()).build();
    }

    @POST
    @Operation(summary = "Register a new author", description = "Creates a new author in the system")
    @APIResponse(responseCode = "201", description = "Author created")
    public Response registerAuthor(AuthorRequestDTO registerAuthorDto ) {

        return Response.status(Response.Status.CREATED).entity(iAuthorService.registerAuthor(registerAuthorDto)).build();
    }

}
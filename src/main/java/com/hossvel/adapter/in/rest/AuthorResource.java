package com.hossvel.adapter.in.rest;

import com.hossvel.aplication.dto.AuthorRequestDTO;
import com.hossvel.aplication.port.in.IAuthorService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/authors")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AuthorResource {

    @Inject
    IAuthorService iAuthorService;

    @GET
    public Response getAll() {

        return Response.status(Response.Status.CREATED).entity(iAuthorService.getAllAuthors()).build();
    }

    @POST
    public Response registerAuthor(AuthorRequestDTO registerAuthorDto ) {

        return Response.status(Response.Status.CREATED).entity(iAuthorService.registerAuthor(registerAuthorDto)).build();
    }

}
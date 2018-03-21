/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imos.sample.rest;

import com.imos.sample.rest.model.BaseModel;
import com.imos.sample.rest.model.DetailModel;
import com.imos.sample.rest.model.SearchModel;
import com.imos.sample.rest.model.UserModel;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Pintu
 */
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RESTService {

    @GET
    public Response getMessage() {
        return returnResponse(new BaseModel(), BaseModel.class);
    }

    @Path("/sample")
    @GET
    public Response getMoreMessage() {
        return returnResponse(new DetailModel(), DetailModel.class);
    }
    
    @Path("/{userId}/sample")
    @GET
    public Response getUserMessage(@PathParam("userId") String userId) {
        return returnResponse(new UserModel(userId), UserModel.class);
    }
    
    @Path("/{userId}/sample")
    @GET
    public Response getSearchMessage(@PathParam("userId") String userId, @QueryParam("text") String text) {
        return returnResponse(new SearchModel(userId, text), SearchModel.class);
    }

    private <T> Response returnResponse(T data, Class<T> cls) {
        return Response.ok(new GenericEntity<>(data, cls), MediaType.APPLICATION_JSON)
                .build();
    }
}

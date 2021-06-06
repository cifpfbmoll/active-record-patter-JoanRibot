package org.pingpong.restjson;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.Optional;
import javax.ws.rs.core.MediaType;


@Path("/encargo")
public class ResourceEncargo {

    @Inject
    Service service;
    
    public ResourceEncargo() {
    }

    @GET
    @Path("/{id}")
    // curl -w "\n" http://localhost:8080/fruits/Apple -v
    // curl -w "\n" http://localhost:8080/fruits/jkl -v
    public Response get(@PathParam("id") Long id) {
        Optional<Encargo> encargo = service.getEncargo(id);
        return encargo.isPresent()? 
            Response.status(Response.Status.OK).entity(encargo.get()).build() : 
            Response.status(Response.Status.NOT_FOUND).build();
    }
    
    
}

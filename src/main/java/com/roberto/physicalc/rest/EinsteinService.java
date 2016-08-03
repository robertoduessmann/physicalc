package com.roberto.physicalc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.roberto.physicalc.impl.EinstenImpl;
import com.roberto.physicalc.impl.JsonUtil;
import com.roberto.physicalc.model.Einsten;

@Path("/einsten")
public class EinsteinService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{mass}")
    public Response executeCommands(@PathParam("mass") String param) {
        
    	double mass = Double.parseDouble(param);
    	
    	Einsten ein = new EinstenImpl();
    	double energy = ein.getEnergy(mass);
    	
    	return Response.ok(JsonUtil.generateJson(mass, energy)).build();
    	
    }
}

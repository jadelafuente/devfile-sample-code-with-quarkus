package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello-newcall")
public class GreetingResourceNewCall {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String helloNewCall() {
        return "Hello NewCall Quarkus Java Test Answer: Pilot for new answers";
    }
}

package com.linkhos.kotlinjavaee8;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/message")
public class MessageEndpoint {

    @GET
    public String hello() {
        return "Hello world!";
    }
}

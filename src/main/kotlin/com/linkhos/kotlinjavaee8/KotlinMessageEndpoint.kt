package com.linkhos.kotlinjavaee8

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("kotlinmessage")
class KotlinMessageEndpoint {

    @GET
    fun hello(): String = """Hello world from Kotlin ${KotlinVersion.CURRENT}!"""
}

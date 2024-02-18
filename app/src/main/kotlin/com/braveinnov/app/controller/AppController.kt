package com.braveinnov.app.controller

import org.apache.camel.builder.RouteBuilder
import org.apache.camel.model.rest.RestBindingMode
import org.springframework.stereotype.Controller


@Controller
class AppController: RouteBuilder() {

    init {
        println("Initializing AppController...")
    }
    override fun configure() {

        println("Loading AppController routes...")

        restConfiguration()
            .component("servlet")
            .bindingMode(RestBindingMode.json)

        rest("/api")
            .get("/hello")
            .to("direct:hello")

        from("direct:hello").transform().constant(mapOf("message" to "Hello World"))
    }
}
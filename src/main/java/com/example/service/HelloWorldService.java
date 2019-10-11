package com.example.service;

import javax.enterprise.context.ApplicationScoped;

import com.example.model.Request;
import com.example.model.Response;

@ApplicationScoped
public class HelloWorldService {

    public Response sayHello(Request request) {
        Response response = new Response();
        response.greet = "Hello " + request.name +"!!!";
        return response;
    }

}
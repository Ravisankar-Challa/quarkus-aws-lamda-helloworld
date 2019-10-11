package com.example;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.example.model.Request;
import com.example.model.Response;
import com.example.service.HelloWorldService;

@ApplicationScoped
public class HelloWorldLamdaHandler implements RequestHandler<Request, Response> {

    @Inject
    HelloWorldService helloWorldService;

    @Override
    public Response handleRequest(Request input, Context context) {
        return helloWorldService.sayHello(input);
    }

}
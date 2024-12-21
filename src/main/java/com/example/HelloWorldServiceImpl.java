package com.example;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.example.HelloWorldServiceImpl", targetNamespace = "http://example.com/")
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
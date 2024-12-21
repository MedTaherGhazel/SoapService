package com.example;

import jakarta.xml.ws.Endpoint;

public class HelloWorldPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8082/ws/hello", new HelloWorldServiceImpl());
        System.out.println("Service is published at http://localhost:8082/ws/hello");
    }
}

package com.example;

import jakarta.jws.WebService;


@WebService
public interface HelloWorldService {
    String sayHello(String name);
}

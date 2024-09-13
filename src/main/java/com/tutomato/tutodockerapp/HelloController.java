package com.tutomato.tutodockerapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = {"/", "/index", "/hello"})
    public String index(){
        return "hello docker app";
    }
}

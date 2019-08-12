package com.adminos.services;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ApiServicesV1 {

    @RequestMapping("/")
    public String status() {
      return  new Throwable().getStackTrace()[0].getMethodName();
    }


    @PostMapping ("/cat")
    public String cat() {
        return  new Throwable().getStackTrace()[0].getMethodName();
    }
}



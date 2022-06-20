package com.java.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/app-java-demo/api/hello")
public class HelloController {

    @RequestMapping( method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE )
    @ResponseStatus( value = HttpStatus.OK )
    public String getHealthService(){
        return "hello Worl";
    }

}

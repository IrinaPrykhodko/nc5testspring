package com.netcracker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping("/")
    public String hello(){
        return "Hello, spring boot app without checkbox ci!" +
                "New pull request for jenkins";
    }
}

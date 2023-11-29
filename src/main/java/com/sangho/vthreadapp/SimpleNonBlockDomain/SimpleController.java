package com.sangho.vthreadapp.SimpleNonBlockDomain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {
    @GetMapping("/simple")
    public String simpleDefaultResponse(){
        return "thread name " + Thread.currentThread().getName() + " return";
    }
}

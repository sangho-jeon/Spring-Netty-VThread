package com.sangho.vthreadapp.SimpleNonBlockDomain;

import com.sangho.vthreadapp.Util.ThreadInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {
    @GetMapping("/simple")
    public String simpleDefaultResponse(){
        return ThreadInformation.getThreadInfo();
    }
}

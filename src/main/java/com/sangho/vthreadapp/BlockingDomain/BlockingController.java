package com.sangho.vthreadapp.BlockingDomain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockingController {
    @GetMapping("/block")
    private String blockResponse() throws InterruptedException {
        Thread.sleep(1000);
        return "thread name " + Thread.currentThread().getName() + " return";
    }
}

package com.sangho.vthreadapp.BlockDomain;

import com.sangho.vthreadapp.Util.ThreadInformation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockController {
    @GetMapping("/block")
    private String blockResponse() throws InterruptedException {
        Thread.sleep(1000);
        return ThreadInformation.getThreadInfo();
    }
}

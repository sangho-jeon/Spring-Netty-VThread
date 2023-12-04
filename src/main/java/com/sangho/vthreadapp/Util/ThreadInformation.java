package com.sangho.vthreadapp.Util;

import org.springframework.stereotype.Component;

@Component
public class ThreadInformation {
    public static String getThreadInfo(){
        String threadInfo = " thread " + Thread.currentThread().getName() + " is in state : " + Thread.currentThread().getState();
        if(Thread.currentThread().isVirtual()){
            return "virtual " + threadInfo;
        }
        return threadInfo;
    }
}

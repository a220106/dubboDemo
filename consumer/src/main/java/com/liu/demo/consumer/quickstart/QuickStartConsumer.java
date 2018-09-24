package com.liu.demo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liu.demo.privider.ServiceAPi;
import org.springframework.stereotype.Component;

@Component
public class QuickStartConsumer {
    @Reference(url = "dubbo://127.0.0.1:20880")
    ServiceAPi serviceAPi;

    public void sendMessage(String message){
        System.out.println(serviceAPi.sendMessage(message));
    }
}

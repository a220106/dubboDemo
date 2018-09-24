package com.liu.demo.privider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.liu.demo.privider.ServiceAPi;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ServiceAPi.class)
public class QuickstartServielmpl implements ServiceAPi {
    @Override
    public String sendMessage(String message) {
        return "demo" + message;
    }
}

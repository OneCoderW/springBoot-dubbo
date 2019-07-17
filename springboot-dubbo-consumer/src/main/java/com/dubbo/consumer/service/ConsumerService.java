package com.dubbo.consumer.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.provider.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Reference
    private ProviderService providerService;

    public String hello(String name){
        return providerService.sayHello(name);
    }

}

package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.provider.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}

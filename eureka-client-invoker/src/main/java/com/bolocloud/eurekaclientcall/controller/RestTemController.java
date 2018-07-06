package com.bolocloud.eurekaclientcall.controller;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.ZoneAwareLoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.SpringClientFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class RestTemController {

    @Resource(name = "restTemplateCommon")
    RestTemplate template;

    @Autowired
    private LoadBalancerClient client;

    @Autowired
    private SpringClientFactory factory;

    @GetMapping(value = "/call")
    public String call(){
        String msg = template.getForObject("http://eureka-provider/provider",String.class);
        return msg;
    }

    @GetMapping(value = "/clientcall")
    public ServiceInstance clientcall(){
        ServiceInstance si = client.choose("eureka-provider");
        return si;
    }

    @GetMapping(value = "/factory")
    public String factory() {
        ZoneAwareLoadBalancer lb = (ZoneAwareLoadBalancer) factory.getLoadBalancer("eureka-call");
        String msg = lb.getRule().getClass().getName();

        ZoneAwareLoadBalancer lb2 = (ZoneAwareLoadBalancer) factory.getLoadBalancer("default");
        msg += "====="+lb2.getRule().getClass().getName();
        return msg;
    }
}

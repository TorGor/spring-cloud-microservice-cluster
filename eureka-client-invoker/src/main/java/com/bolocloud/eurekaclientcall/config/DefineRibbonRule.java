package com.bolocloud.eurekaclientcall.config;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;

public class DefineRibbonRule implements IRule {

    private ILoadBalancer lb;

    @Override
    public Server choose(Object key) {
        System.out.println("====My Rule====");
        Random r = new Random();
        int randomNum = r.nextInt(10);
        List<Server> servers = lb.getAllServers();
        if(randomNum > 7) {
            Server s = getServerByPort(servers, 8081);
            return s;
        }
        return getServerByPort(servers, 8082);
    }

    private Server getServerByPort(List<Server> servers, int port) {
        for(Server s : servers) {
            if(s.getPort() == port) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        this.lb = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return lb;
    }
}

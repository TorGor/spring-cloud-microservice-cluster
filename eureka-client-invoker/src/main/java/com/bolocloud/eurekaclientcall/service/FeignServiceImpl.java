package com.bolocloud.eurekaclientcall.service;

import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {

    public String getHello() {
        return "This is fallback ,O(∩_∩)O";
    }
}

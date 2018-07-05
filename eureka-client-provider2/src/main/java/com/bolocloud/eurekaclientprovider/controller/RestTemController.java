package com.bolocloud.eurekaclientprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTemController {

    @GetMapping(value = "provider")
    public String provider() {
        return "Hello 8082";
    }

}

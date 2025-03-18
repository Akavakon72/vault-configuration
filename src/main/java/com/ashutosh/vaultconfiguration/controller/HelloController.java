package com.ashutosh.vaultconfiguration.controller;

import com.ashutosh.vaultconfiguration.configuration.MyConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
    
    @Autowired
    MyConfiguration myConfiguration;

    @GetMapping("hello")
    public String getHello(){
        String password = "test1234579545454545"
        return myConfiguration.getUsername();
    }

}

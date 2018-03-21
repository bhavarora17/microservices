package com.bhavya.cloudExample.limitsservice.LimitConfigurationController;

import com.bhavya.cloudExample.limitsservice.bean.LimitConfiguration;
import com.bhavya.cloudExample.limitsservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private LimitConfiguration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsConfiguration(){
        return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
    }

}

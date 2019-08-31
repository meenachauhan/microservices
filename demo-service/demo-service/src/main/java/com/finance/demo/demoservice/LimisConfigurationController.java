package com.finance.demo.demoservice;

import com.finance.demo.demoservice.bean.LimitsConfiguation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(Configuration.class)
public class LimisConfigurationController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitsConfiguation getLimitConfuguration() {
        return new LimitsConfiguation(configuration.getMax(),configuration.getMin());
    }
}

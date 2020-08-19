package com.stranger.eurekawebdemo.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfigure {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}

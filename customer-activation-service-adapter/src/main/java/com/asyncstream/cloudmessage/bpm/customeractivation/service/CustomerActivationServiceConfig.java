package com.asyncstream.cloudmessage.bpm.customeractivation.service;

import com.asyncstream.cloudmessage.bpm.customeractivation.service.api.CustomerActivationService;
import com.asyncstream.cloudmessage.bpm.customeractivation.service.impl.CustomerActivationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerActivationServiceConfig {

    @Bean
    CustomerActivationService customerActivationService(){
        return new CustomerActivationServiceImpl();
    }
}

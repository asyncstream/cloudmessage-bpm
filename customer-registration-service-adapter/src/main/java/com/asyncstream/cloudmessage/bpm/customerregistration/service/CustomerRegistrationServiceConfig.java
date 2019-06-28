package com.asyncstream.cloudmessage.bpm.customerregistration.service;

import com.asyncstream.cloudmessage.bpm.customerregistration.service.api.CustomerRegistrationService;
import com.asyncstream.cloudmessage.bpm.customerregistration.service.impl.CustomerRegistrationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerRegistrationServiceConfig {
    @Bean
    public CustomerRegistrationService customerRegistrationService(){
        return new CustomerRegistrationServiceImpl();

    }
}

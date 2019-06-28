package com.asyncstream.cloudmessage.bpm.customercessation.service;

import com.asyncstream.cloudmessage.bpm.customercessation.service.api.CustomerCessationService;
import com.asyncstream.cloudmessage.bpm.customercessation.service.impl.CustomerCessationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerCessationServiceConfig {

    @Bean
    public CustomerCessationService customerCessationService(){
        return new CustomerCessationServiceImpl();
    }

}

package com.asyncstream.cloudmessage.bpm.customercessation.process;

import com.asyncstream.cloudmessage.bpm.customercessation.process.delegate.CustomerCessation;
import com.asyncstream.cloudmessage.bpm.customercessation.service.api.CustomerCessationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerCessationProcessConfig {

    @Bean
    public CustomerCessation customerCessation(CustomerCessationService customerCessationService){
        return new CustomerCessation(customerCessationService);
    }
}

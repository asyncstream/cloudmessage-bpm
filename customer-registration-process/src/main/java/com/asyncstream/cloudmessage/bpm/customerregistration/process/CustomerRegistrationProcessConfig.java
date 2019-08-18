package com.asyncstream.cloudmessage.bpm.customerregistration.process;


import com.asyncstream.cloudmessage.bpm.customerregistration.process.delegate.SendForCardVerification;
import com.asyncstream.cloudmessage.bpm.customerregistration.service.api.CustomerRegistrationService;
import com.asyncstream.cloudmessage.bpm.customerregistration.process.delegate.CustomerRegistration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class CustomerRegistrationProcessConfig {

    @Bean
    public CustomerRegistration customerRegistration(CustomerRegistrationService customerRegistrationService){
        return new CustomerRegistration(customerRegistrationService);
    }

    @Bean
    public SendForCardVerification sendForCardVerification(CustomerRegistrationService customerRegistrationService){
        return new SendForCardVerification(customerRegistrationService);
    }
}

package com.asyncstream.cloudmessage.bpm.customeractivation.process;

import com.asyncstream.cloudmessage.bpm.customeractivation.process.delegate.CompleteActivation;
import com.asyncstream.cloudmessage.bpm.customeractivation.process.delegate.ProcessActivationResult;
import com.asyncstream.cloudmessage.bpm.customeractivation.process.delegate.SendActivationRequest;
import com.asyncstream.cloudmessage.bpm.customeractivation.process.delegate.StartActivation;
import com.asyncstream.cloudmessage.bpm.customeractivation.service.api.CustomerActivationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerActivationProcessConfig {
    @Bean
    public StartActivation startActivation(){
        return new StartActivation();
    }

    @Bean
    public SendActivationRequest sendActivationRequest(CustomerActivationService customerActivationService){
        return new SendActivationRequest(customerActivationService);
    }

    @Bean
    public ProcessActivationResult processActivationResult(CustomerActivationService customerActivationService){
        return new ProcessActivationResult(customerActivationService);
    }

    @Bean
    public CompleteActivation completeActivation(CustomerActivationService customerActivationService){
        return new CompleteActivation(customerActivationService);
    }
}

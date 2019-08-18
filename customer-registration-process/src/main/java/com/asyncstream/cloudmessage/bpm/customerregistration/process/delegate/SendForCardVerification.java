package com.asyncstream.cloudmessage.bpm.customerregistration.process.delegate;

import com.asyncstream.cloudmessage.bpm.customerregistration.service.api.CustomerRegistrationService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendForCardVerification implements JavaDelegate {

    private final Logger LOG = LoggerFactory.getLogger(SendForCardVerification.class);
    private CustomerRegistrationService customerRegistrationService;

    public SendForCardVerification(CustomerRegistrationService customerRegistrationService){
        this.customerRegistrationService=customerRegistrationService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }
}

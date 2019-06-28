package com.asyncstream.cloudmessage.bpm.customerregistration.process.delegate;

import com.asyncstream.cloudmessage.bpm.customerregistration.service.api.CustomerRegistrationService;
import com.asyncstream.cloudmessage.bpm.customerregistration.service.api.RegistrationRequest;
import com.asyncstream.cloudmessage.bpm.customerregistration.service.api.RegistrationResult;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomerRegistration implements JavaDelegate {

    private final Logger LOG = LoggerFactory.getLogger(CustomerRegistration.class);
    private CustomerRegistrationService customerRegistrationService;

    public  CustomerRegistration(CustomerRegistrationService customerRegistrationService){
        this.customerRegistrationService = customerRegistrationService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        RegistrationRequest registrationRequest = new RegistrationRequest();
        RegistrationResult registrationResult = this.customerRegistrationService.register(registrationRequest);
        LOG.info("Customer registration is completed with id:: {}",registrationResult.getRegistrationId());
    }
}

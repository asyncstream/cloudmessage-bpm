package com.asyncstream.cloudmessage.bpm.customercessation.process.delegate;

import com.asyncstream.cloudmessage.bpm.customercessation.service.api.CustomerCessationService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CustomerCessation implements JavaDelegate {
    private CustomerCessationService customerCessationService;

    public CustomerCessation(CustomerCessationService customerCessationService) {
        this.customerCessationService = customerCessationService;
    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }
}

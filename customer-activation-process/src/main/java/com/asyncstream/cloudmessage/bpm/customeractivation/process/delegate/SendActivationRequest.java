package com.asyncstream.cloudmessage.bpm.customeractivation.process.delegate;

import com.asyncstream.cloudmessage.bpm.customeractivation.service.api.CustomerActivationService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendActivationRequest implements JavaDelegate {

    private CustomerActivationService customerActivationService;

    public SendActivationRequest(CustomerActivationService customerActivationService) {
        this.customerActivationService = customerActivationService;

    }

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {

    }
}

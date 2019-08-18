package com.asyncstream.cloudmessage.bpm.customeractivation.service.impl;

import com.asyncstream.cloudmessage.bpm.customeractivation.service.api.ActivationRequest;
import com.asyncstream.cloudmessage.bpm.customeractivation.service.api.ActivationResult;
import com.asyncstream.cloudmessage.bpm.customeractivation.service.api.CompletedActivation;
import com.asyncstream.cloudmessage.bpm.customeractivation.service.api.CustomerActivationService;

public class CustomerActivationServiceImpl implements CustomerActivationService {

    @Override
    public Boolean sendActivationMessage(ActivationRequest activationRequest) {
        return null;
    }

    @Override
    public Boolean processActivationResult(ActivationResult activationResult) {
        return null;
    }

    @Override
    public CompletedActivation completeActivation() {
        return null;
    }
}

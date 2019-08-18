package com.asyncstream.cloudmessage.bpm.customeractivation.service.api;

public interface CustomerActivationService {
    Boolean sendActivationMessage(ActivationRequest activationRequest);
    Boolean processActivationResult(ActivationResult activationResult);
    CompletedActivation completeActivation();
}

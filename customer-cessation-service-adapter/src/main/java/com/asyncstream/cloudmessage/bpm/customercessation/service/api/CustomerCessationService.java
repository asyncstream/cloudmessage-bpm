package com.asyncstream.cloudmessage.bpm.customercessation.service.api;

public interface CustomerCessationService {
    CessationResult cease(CessationRequest request);
}

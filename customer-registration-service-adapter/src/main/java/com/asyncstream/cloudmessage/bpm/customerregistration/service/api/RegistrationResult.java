package com.asyncstream.cloudmessage.bpm.customerregistration.service.api;

import java.util.Objects;

public class RegistrationResult {

    private String registrationId;

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationResult that = (RegistrationResult) o;
        return Objects.equals(registrationId, that.registrationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationId);
    }
}

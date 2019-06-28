package com.asyncstream.cloudmessage.bpm.customerregistration.service.api;

import java.util.Objects;

public class RegistrationRequest {
    private String name;
    private String email;
    private String handy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHandy() {
        return handy;
    }

    public void setHandy(String handy) {
        this.handy = handy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationRequest that = (RegistrationRequest) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(email, that.email) &&
                Objects.equals(handy, that.handy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, handy);
    }
}

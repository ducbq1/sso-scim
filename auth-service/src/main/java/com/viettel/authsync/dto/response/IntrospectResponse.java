package com.viettel.authsync.dto.response;

import java.util.Set;

public class IntrospectResponse {
    private String username;
    private String organization;
    private Set<String> roles;
    private boolean valid;

    private IntrospectResponse(Builder builder) {
        this.username = builder.username;
        this.organization = builder.organization;
        this.roles = builder.roles;
        this.valid = builder.valid;
    }

    public static class Builder {
        private String username;
        private String organization;
        private Set<String> roles;
        private boolean valid;

        public IntrospectResponse.Builder username(String username) {
            this.username = username;
            return this;
        }

        public IntrospectResponse.Builder organization(String organization) {
            this.organization = organization;
            return this;
        }

        public IntrospectResponse.Builder roles(Set<String> roles) {
            this.roles = roles;
            return this;
        }

        public IntrospectResponse.Builder valid(boolean valid) {
            this.valid = valid;
            return this;
        }

        public IntrospectResponse build() {
            return new IntrospectResponse(this);
        }
    }

    public static IntrospectResponse.Builder builder() {
        return new IntrospectResponse.Builder();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}

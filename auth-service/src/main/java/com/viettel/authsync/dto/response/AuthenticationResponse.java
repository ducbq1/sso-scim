package com.viettel.authsync.dto.response;

import com.viettel.authsync.dto.request.IntrospectRequest;

public class AuthenticationResponse {
    private String token;
    private boolean authenticated;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }

    private AuthenticationResponse(Builder builder) {
        this.token = builder.token;
        this.authenticated = builder.authenticated;
    }


    public static class Builder {
        private String token;
        private boolean authenticated;

        public AuthenticationResponse.Builder token(String token) {
            this.token = token;
            return this;
        }

        public AuthenticationResponse.Builder authenticated(boolean token) {
            this.authenticated = authenticated;
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(this);
        }
    }

    public static AuthenticationResponse.Builder builder() {
        return new AuthenticationResponse.Builder();
    }


}

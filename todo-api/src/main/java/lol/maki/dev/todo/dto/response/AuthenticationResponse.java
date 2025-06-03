package lol.maki.dev.todo.dto.response;

import lol.maki.dev.todo.dto.request.IntrospectRequest;

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

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder authenticated(boolean token) {
            this.authenticated = authenticated;
            return this;
        }

        public AuthenticationResponse build() {
            return new AuthenticationResponse(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }


}

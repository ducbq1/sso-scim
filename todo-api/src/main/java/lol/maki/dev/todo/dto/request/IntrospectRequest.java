package lol.maki.dev.todo.dto.request;


import lol.maki.dev.todo.dto.response.ApiResponse;

public class IntrospectRequest {
    private String token;

    private IntrospectRequest(Builder builder) {
        this.token = builder.token;
    }

    public String getToken() {
        return token;
    }

    public static class Builder {
        private String token;

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public IntrospectRequest build() {
            return new IntrospectRequest(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}

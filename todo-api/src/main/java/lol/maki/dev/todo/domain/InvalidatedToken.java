package lol.maki.dev.todo.domain;

import lol.maki.dev.todo.dto.request.IntrospectRequest;
import jakarta.persistence.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.Date;

@RedisHash("InvalidatedToken")
public class InvalidatedToken {
    @Id
    private String id;

    private Date expiryTime;

    private InvalidatedToken(Builder builder) {
        this.id = builder.id;
        this.expiryTime = builder.expiryTime;
    }

    public static class Builder {
        private String id;
        private Date expiryTime;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder expiryTime(Date expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public InvalidatedToken build() {
            return new InvalidatedToken(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(Date expiryTime) {
        this.expiryTime = expiryTime;
    }
}

package com.viettel.authsync.domain;

import com.viettel.authsync.dto.request.IntrospectRequest;
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

        public InvalidatedToken.Builder id(String id) {
            this.id = id;
            return this;
        }

        public InvalidatedToken.Builder expiryTime(Date expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }

        public InvalidatedToken build() {
            return new InvalidatedToken(this);
        }
    }

    public static InvalidatedToken.Builder builder() {
        return new InvalidatedToken.Builder();
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

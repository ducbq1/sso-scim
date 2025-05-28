package com.viettel.authsync.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

@ConfigurationProperties(prefix = "jwt")
public record JwtProperties(Map<String, KeySet> keys) {

    public record KeySet(RSAPublicKey publicKey, RSAPrivateKey privateKey) {
    }
}

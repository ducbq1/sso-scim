package com.viettel.authsync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class AuthSyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthSyncApplication.class, args);
    }

}

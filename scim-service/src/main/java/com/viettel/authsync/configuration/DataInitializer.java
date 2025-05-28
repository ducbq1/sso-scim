package com.viettel.authsync.configuration;

import com.viettel.authsync.domain.OAuth2Client;
import com.viettel.authsync.domain.User;
import com.viettel.authsync.service.OAuth2ClientService;
import com.viettel.authsync.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(UserService userService, OAuth2ClientService clientService) {
        return args -> {
            User user = new User();
            user.setUsername("admin");
            user.setEmail("admin@example.com");
            user.setPassword("password");
            userService.save(user);

            OAuth2Client client = new OAuth2Client();
            client.setClientId("my-client-id");
            client.setClientSecret("my-client-secret");
            client.setRedirectUri("http://localhost:8080/callback");
            client.setGrantTypes("authorization_code");
            client.setScope("read write");
            client.setCreatedAt(LocalDateTime.now());
            client.setUser(user);

            clientService.save(client);

            System.out.println("Database initialized with sample data.");
        };
    }
}

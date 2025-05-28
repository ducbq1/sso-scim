package com.viettel.authsync.domain;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;

@Entity
public class UserSession {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_session_seq")
    @SequenceGenerator(name = "user_session_seq", sequenceName = "user_session_seq", allocationSize = 1)
    private Long sessionId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private String refreshToken;
    private String userAgent;
    private String ipAddress;

    @Column(nullable = false)
    private Instant expiresAt;

    @CreatedDate
    private Instant createdAt;

    @Column(columnDefinition = "number(1) default 1")
    private boolean isActive;
}

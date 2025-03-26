package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "TOKEN")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String accessToken;    // JWT hoặc opaque token
    String refreshToken;
    LocalDateTime issuedAt;
    LocalDateTime expiresAt;  // Thời gian hết hạn token
    Boolean revoked;  // Đánh dấu token đã bị thu hồi hay chưa

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}

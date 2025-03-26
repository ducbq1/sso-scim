package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "SCIM_SYNC_TOKEN")
public class ScimSyncToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "token_value", nullable = false)
    String tokenValue;

    @Column(name = "issued_at", nullable = false)
    LocalDateTime issuedAt = LocalDateTime.now();
}

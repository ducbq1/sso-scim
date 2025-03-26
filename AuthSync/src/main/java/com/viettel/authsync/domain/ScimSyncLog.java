package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "SCIM_SYNC_LOG")
public class ScimSyncLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "external_id")
    String externalId;

    @Column(name = "user_id")
    Long userId;  // Can map to User Entity if needed

    @Column(name = "status")
    String status;

    @Column(name = "message", columnDefinition = "TEXT")
    String message;

    @Column(name = "synced_at", nullable = false)
    LocalDateTime syncedAt = LocalDateTime.now();
}

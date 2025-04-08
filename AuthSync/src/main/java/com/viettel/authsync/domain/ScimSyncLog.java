package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "SCIM_SYNC_LOG")
public class ScimSyncLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "user_id")
    private Long userId;  // Can map to User Entity if needed

    @Column(name = "status")
    private String status;

    @Column(name = "message", columnDefinition = "TEXT")
    private String message;

    @Column(name = "synced_at", nullable = false)
    private LocalDateTime syncedAt = LocalDateTime.now();
}

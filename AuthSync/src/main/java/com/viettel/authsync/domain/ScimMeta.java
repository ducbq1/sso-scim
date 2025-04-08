package com.viettel.authsync.domain;

import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "SCIM_META")
public class ScimMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created", nullable = false, updatable = false)
    private LocalDateTime created = LocalDateTime.now();

    @Column(name = "last_modified")
    private LocalDateTime lastModified = LocalDateTime.now();

    @Column(name = "resource_type", nullable = false)
    private String resourceType;

    @Column(name = "location", nullable = false)
    private String location;
}

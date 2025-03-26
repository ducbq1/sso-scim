package com.viettel.authsync.domain;

import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "SCIM_META")
public class ScimMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "created", nullable = false, updatable = false)
    LocalDateTime created = LocalDateTime.now();

    @Column(name = "last_modified")
    LocalDateTime lastModified = LocalDateTime.now();

    @Column(name = "resource_type", nullable = false)
    String resourceType;

    @Column(name = "location", nullable = false)
    String location;
}

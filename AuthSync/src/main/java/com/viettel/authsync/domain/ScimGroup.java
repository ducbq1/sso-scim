package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SCIM_GROUP")
public class ScimGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "display_name", nullable = false)
    String displayName;

    @Column(name = "description")
    String description;

    @Column(name = "created", nullable = false, updatable = false)
    LocalDateTime created = LocalDateTime.now();

    @Column(name = "last_modified")
    LocalDateTime lastModified = LocalDateTime.now();

    // Many-to-Many mapping with User
    @ManyToMany(mappedBy = "groups")
    Set<ScimUser> users = new HashSet<>();
}

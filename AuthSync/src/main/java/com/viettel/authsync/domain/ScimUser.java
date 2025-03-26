package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "SCIM_USER")
public class ScimUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String externalId;  // ID dùng ngoài SCIM để tham chiếu
    String userName;
    String displayName;
    String email;
    Boolean active;
    String locale;       // Ngôn ngữ, quốc gia
    LocalDateTime createdAt;
    LocalDateTime updatedAt;

    // Many-to-Many mapping with SCIM Group
    @ManyToMany
    @JoinTable(
            name = "scim_user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    Set<ScimGroup> groups = new HashSet<>();
}

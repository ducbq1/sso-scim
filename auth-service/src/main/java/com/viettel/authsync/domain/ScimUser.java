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
    private Long id;
    private String externalId;  // ID dùng ngoài SCIM để tham chiếu
    private String userName;
    private String displayName;
    private String email;
    private Boolean active;
    private String locale;       // Ngôn ngữ, quốc gia
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Many-to-Many mapping with SCIM Group
    @ManyToMany
    @JoinTable(
            name = "scim_user_group",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<ScimGroup> groups = new HashSet<>();
}

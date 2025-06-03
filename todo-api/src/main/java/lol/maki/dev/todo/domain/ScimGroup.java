package lol.maki.dev.todo.domain;

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
    private Long id;

    @Column(name = "display_name", nullable = false)
    private String displayName;

    @Column(name = "description")
    private String description;

    @Column(name = "created", nullable = false, updatable = false)
    private LocalDateTime created = LocalDateTime.now();

    @Column(name = "last_modified")
    private LocalDateTime lastModified = LocalDateTime.now();

    // Many-to-Many mapping with User
    @ManyToMany(mappedBy = "groups")
    private Set<ScimUser> users = new HashSet<>();
}

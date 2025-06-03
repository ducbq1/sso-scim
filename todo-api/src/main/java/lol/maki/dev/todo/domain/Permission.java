package lol.maki.dev.todo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Set;

@Entity
public class Permission {
    @Id
    private String name;

    private String description;

    @ManyToMany(mappedBy = "permissions")
    private Set<Role> roles;
}

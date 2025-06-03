package lol.maki.dev.todo.domain;

import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "SCIM_PROVISIONING")
public class ScimProvisioning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String action;  // VD: "CREATE", "UPDATE", "DELETE"
    private String resourceType;  // VD: "User", "Group"
    private LocalDateTime timestamp;
    private String status;   // VD: "SUCCESS", "FAILED"
}

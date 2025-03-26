package com.viettel.authsync.domain;

import jakarta.persistence.*;


import java.time.LocalDateTime;


@Entity
@Table(name = "SCIM_PROVISIONING")
public class ScimProvisioning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String action;  // VD: "CREATE", "UPDATE", "DELETE"
    String resourceType;  // VD: "User", "Group"
    LocalDateTime timestamp;
    String status;   // VD: "SUCCESS", "FAILED"
}

package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "SCIM_SCHEMA")
public class ScimSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String schemaUri;     // URI của schema (vd: "urn:ietf:params:scim:schemas:core:2.0:User")
    private String name;          // Tên schema
    private String description;   // Mô tả schema

    @Column(name = "attributes", columnDefinition = "TEXT")
    private String attributes;  // Lưu JSON String, hoặc có thể dùng @Lob annotation nếu cần
//    @ElementCollection
//    private List<String> attributes;  // Các thuộc tính được định nghĩa trong schema này
}

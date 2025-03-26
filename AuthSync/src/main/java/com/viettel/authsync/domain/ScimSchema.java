package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "SCIM_SCHEMA")
public class ScimSchema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String schemaUri;     // URI của schema (vd: "urn:ietf:params:scim:schemas:core:2.0:User")
    String name;          // Tên schema
    String description;   // Mô tả schema

    @Column(name = "attributes", columnDefinition = "TEXT")
    String attributes;  // Lưu JSON String, hoặc có thể dùng @Lob annotation nếu cần
//    @ElementCollection
//    private List<String> attributes;  // Các thuộc tính được định nghĩa trong schema này
}

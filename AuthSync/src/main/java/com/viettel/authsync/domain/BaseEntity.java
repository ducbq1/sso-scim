package com.viettel.authsync.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass  // Chỉ định rằng class này làm base entity cho các bảng con
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;  // ID dùng chung cho mọi entity

    @CreationTimestamp
    @Column(updatable = false)
    LocalDateTime createdAt;  // Thời gian tạo (sử dụng Hibernate tự động gán)

    @UpdateTimestamp
    LocalDateTime updatedAt;  // Thời gian cập nhật (Hibernate tự động gán)

    String createdBy;  // Người tạo bản ghi (có thể dùng cơ chế auditor)
    String updatedBy;  // Người chỉnh sửa cuối

    Boolean isDeleted = false;  // Xóa mềm (soft delete)
}

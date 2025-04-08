package com.viettel.authsync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viettel.authsync.domain.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}

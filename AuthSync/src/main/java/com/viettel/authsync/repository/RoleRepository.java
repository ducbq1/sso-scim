package com.viettel.authsync.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viettel.authsync.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {}

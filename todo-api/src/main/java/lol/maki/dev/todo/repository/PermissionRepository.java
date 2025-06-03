package lol.maki.dev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lol.maki.dev.todo.domain.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}

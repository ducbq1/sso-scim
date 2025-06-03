package lol.maki.dev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import lol.maki.dev.todo.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, String>, JpaSpecificationExecutor<Role> {}

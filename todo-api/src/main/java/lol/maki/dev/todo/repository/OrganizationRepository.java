package lol.maki.dev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lol.maki.dev.todo.domain.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    Organization findByName(String name);
}

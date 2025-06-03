package lol.maki.dev.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import lol.maki.dev.todo.domain.InvalidatedToken;

@Repository
public interface InvalidatedTokenRepository extends CrudRepository<InvalidatedToken, String> {}

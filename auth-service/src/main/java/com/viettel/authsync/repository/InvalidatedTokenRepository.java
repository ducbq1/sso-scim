package com.viettel.authsync.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.viettel.authsync.domain.InvalidatedToken;

@Repository
public interface InvalidatedTokenRepository extends CrudRepository<InvalidatedToken, String> {}

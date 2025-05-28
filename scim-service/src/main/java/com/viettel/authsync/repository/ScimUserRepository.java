package com.viettel.authsync.repository;

import com.viettel.authsync.domain.ScimUser;
import org.springframework.stereotype.Repository;

@Repository
public interface ScimUserRepository extends BaseRepository<ScimUser, Long> {
    // Nếu cần thêm các phương thức tùy chỉnh
}

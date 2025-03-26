package com.viettel.authsync.repository;

import com.viettel.authsync.domain.OAuth2Client;
import com.viettel.authsync.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
    // Nếu cần thêm các phương thức tùy chỉnh
}

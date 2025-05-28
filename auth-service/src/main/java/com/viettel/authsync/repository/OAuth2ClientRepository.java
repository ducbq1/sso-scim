package com.viettel.authsync.repository;

import com.viettel.authsync.domain.OAuth2Client;
import com.viettel.authsync.domain.ScimUser;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuth2ClientRepository extends BaseRepository<OAuth2Client, String> {
    // Nếu cần thêm các phương thức tùy chỉnh
}

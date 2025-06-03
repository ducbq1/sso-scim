package lol.maki.dev.todo.repository;

import lol.maki.dev.todo.domain.OAuth2Client;
import lol.maki.dev.todo.domain.ScimUser;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuth2ClientRepository extends BaseRepository<OAuth2Client, String> {
    // Nếu cần thêm các phương thức tùy chỉnh
}

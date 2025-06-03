package lol.maki.dev.todo.repository;

import lol.maki.dev.todo.domain.ScimUser;
import org.springframework.stereotype.Repository;

@Repository
public interface ScimUserRepository extends BaseRepository<ScimUser, Long> {
    // Nếu cần thêm các phương thức tùy chỉnh
}

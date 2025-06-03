package lol.maki.dev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Base repository chung cho các entity.
 * Các repository khác sẽ kế thừa từ đây.
 *
 * @param <T>  Loại entity (bảng)
 * @param <ID> Kiểu dữ liệu của primary key (ID)
 */
@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {
    // Tìm tất cả các bản ghi được tạo trong khoảng thời gian nhất định
    List<T> findAllByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);
}

package lol.maki.dev.todo.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "TOKEN")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String accessToken;    // JWT hoặc opaque token
    private String refreshToken;
    private LocalDateTime issuedAt;
    private LocalDateTime expiresAt;  // Thời gian hết hạn token
    private Boolean revoked;  // Đánh dấu token đã bị thu hồi hay chưa

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

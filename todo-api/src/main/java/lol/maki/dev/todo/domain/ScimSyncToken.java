package lol.maki.dev.todo.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "SCIM_SYNC_TOKEN")
public class ScimSyncToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "token_value", nullable = false)
    private String tokenValue;

    @Column(name = "issued_at", nullable = false)
    private LocalDateTime issuedAt = LocalDateTime.now();
}

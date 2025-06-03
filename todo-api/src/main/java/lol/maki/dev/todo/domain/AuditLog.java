package lol.maki.dev.todo.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "AUDIT_LOG")
public class AuditLog extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "audit_log_seq")
    @SequenceGenerator(name = "audit_log_seq", sequenceName = "audit_log_seq", allocationSize = 1)
    private Long id;
    private String eventType;  // VD: LOGIN, LOGOUT, TOKEN_ISSUE
    private String description;
    private LocalDateTime timestamp;
}

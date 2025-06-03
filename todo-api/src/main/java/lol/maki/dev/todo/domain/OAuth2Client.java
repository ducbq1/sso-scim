package lol.maki.dev.todo.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "OAUTH2_CLIENT")
public class OAuth2Client {
    @Id
    private String clientId;  // ID duy nhất cho từng client
    private String clientSecret;  // Mã bí mật để xác thực
    private String redirectUri;   // URI callback sau khi SSO thành công
    private String grantTypes;    // Các grant type hỗ trợ (e.g., authorization_code, client_credentials)
    private String scope;         // Phạm vi cấp quyền (e.g., "read", "write")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;  // Ứng dụng có thể liên kết với một user tạo ra nó

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getGrantTypes() {
        return grantTypes;
    }

    public void setGrantTypes(String grantTypes) {
        this.grantTypes = grantTypes;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

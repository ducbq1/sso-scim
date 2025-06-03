package lol.maki.dev.todo.controller;

import com.nimbusds.jwt.JWTClaimsSet;
import lol.maki.dev.todo.domain.OAuth2Client;
import lol.maki.dev.todo.service.OAuth2ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/oauth2-clients")
public class OAuth2ClientController {

    private final OAuth2ClientService oAuth2ClientService;

    public OAuth2ClientController(OAuth2ClientService oAuth2ClientService) {
        this.oAuth2ClientService = oAuth2ClientService;
    }

    // Lấy tất cả OAuth2Client
    @GetMapping
    public List<OAuth2Client> getAllClients() {
        JWTClaimsSet s = new JWTClaimsSet.Builder().build();
        return oAuth2ClientService.findAll();
    }

    // Thêm một OAuth2Client mới
    @PostMapping
    public OAuth2Client createClient(@RequestBody OAuth2Client client) {
        return oAuth2ClientService.save(client);
    }

    // Lấy OAuth2Client theo clientId
    @GetMapping("/{clientId}")
    public ResponseEntity<OAuth2Client> getClientById(@PathVariable String clientId) {
        return oAuth2ClientService.findById(clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Cập nhật OAuth2Client
    @PutMapping("/{clientId}")
    public ResponseEntity<OAuth2Client> updateClient(@PathVariable String clientId, @RequestBody OAuth2Client updatedClient) {
        return oAuth2ClientService.findById(clientId).map(client -> {
            client.setClientSecret(updatedClient.getClientSecret());
            client.setRedirectUri(updatedClient.getRedirectUri());
            client.setGrantTypes(updatedClient.getGrantTypes());
            client.setScope(updatedClient.getScope());
            oAuth2ClientService.save(client);
            return ResponseEntity.ok(client);
        }).orElse(ResponseEntity.notFound().build());
    }

    // Xóa OAuth2Client
    @DeleteMapping("/{clientId}")
    public ResponseEntity<Void> deleteClient(@PathVariable String clientId) {
        if (oAuth2ClientService.existsById(clientId)) {
            oAuth2ClientService.deleteById(clientId);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

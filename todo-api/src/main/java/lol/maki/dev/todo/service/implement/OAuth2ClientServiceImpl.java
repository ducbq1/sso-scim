package lol.maki.dev.todo.service.implement;

import lol.maki.dev.todo.domain.OAuth2Client;
import lol.maki.dev.todo.repository.OAuth2ClientRepository;
import lol.maki.dev.todo.service.OAuth2ClientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OAuth2ClientServiceImpl extends BaseServiceImpl<OAuth2Client, String> implements OAuth2ClientService {

    private OAuth2ClientRepository repository;

    public OAuth2ClientServiceImpl(OAuth2ClientRepository repository) {
        super(repository);
    }
}

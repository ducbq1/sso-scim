package com.viettel.authsync.service.implement;

import com.viettel.authsync.domain.OAuth2Client;
import com.viettel.authsync.repository.BaseRepository;
import com.viettel.authsync.repository.OAuth2ClientRepository;
import com.viettel.authsync.service.OAuth2ClientService;
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

package com.viettel.authsync.service.implement;

import com.viettel.authsync.domain.User;
import com.viettel.authsync.repository.OAuth2ClientRepository;
import com.viettel.authsync.repository.UserRepository;
import com.viettel.authsync.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
    private UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}

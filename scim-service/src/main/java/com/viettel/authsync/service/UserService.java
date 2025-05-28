package com.viettel.authsync.service;

import java.util.List;

import com.viettel.authsync.domain.User;
import com.viettel.authsync.dto.request.UserCreationRequest;
import com.viettel.authsync.dto.request.UserUpdateRequest;
import com.viettel.authsync.dto.response.UserResponse;
import org.springframework.stereotype.Service;

public interface UserService {
    UserResponse createUser(UserCreationRequest request);

    UserResponse getMyInfo();

    UserResponse updateUser(Long userId, UserUpdateRequest request);

    void deleteUser(Long userId);

    List<UserResponse> getUsers();

    UserResponse getUser(Long id);

    void save(User user);
}

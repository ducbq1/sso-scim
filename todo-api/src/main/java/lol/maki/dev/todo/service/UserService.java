package lol.maki.dev.todo.service;

import java.util.List;

import lol.maki.dev.todo.domain.User;
import lol.maki.dev.todo.dto.request.UserCreationRequest;
import lol.maki.dev.todo.dto.request.UserUpdateRequest;
import lol.maki.dev.todo.dto.response.UserResponse;
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

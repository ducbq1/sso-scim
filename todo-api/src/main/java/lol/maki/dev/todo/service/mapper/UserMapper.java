package lol.maki.dev.todo.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import lol.maki.dev.todo.domain.User;
import lol.maki.dev.todo.dto.request.UserCreationRequest;
import lol.maki.dev.todo.dto.request.UserUpdateRequest;
import lol.maki.dev.todo.dto.response.UserResponse;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "organization", ignore = true)
    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

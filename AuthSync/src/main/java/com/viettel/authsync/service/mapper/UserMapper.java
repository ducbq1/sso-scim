package com.viettel.authsync.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.viettel.authsync.domain.User;
import com.viettel.authsync.dto.request.UserCreationRequest;
import com.viettel.authsync.dto.request.UserUpdateRequest;
import com.viettel.authsync.dto.response.UserResponse;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    @Mapping(target = "organization", ignore = true)
    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}

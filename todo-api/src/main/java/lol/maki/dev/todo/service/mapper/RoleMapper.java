package lol.maki.dev.todo.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import lol.maki.dev.todo.domain.Role;
import lol.maki.dev.todo.dto.request.RoleRequest;
import lol.maki.dev.todo.dto.response.RoleResponse;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}

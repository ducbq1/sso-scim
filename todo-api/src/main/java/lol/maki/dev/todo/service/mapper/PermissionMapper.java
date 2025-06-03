package lol.maki.dev.todo.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import lol.maki.dev.todo.domain.Permission;
import lol.maki.dev.todo.dto.request.PermissionRequest;
import lol.maki.dev.todo.dto.response.PermissionResponse;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}

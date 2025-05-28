package com.viettel.authsync.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.viettel.authsync.domain.Permission;
import com.viettel.authsync.dto.request.PermissionRequest;
import com.viettel.authsync.dto.response.PermissionResponse;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}

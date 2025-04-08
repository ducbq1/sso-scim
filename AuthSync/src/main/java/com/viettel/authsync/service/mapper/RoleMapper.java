package com.viettel.authsync.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.viettel.authsync.domain.Role;
import com.viettel.authsync.dto.request.RoleRequest;
import com.viettel.authsync.dto.response.RoleResponse;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    @Mapping(target = "organizations", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}

package com.viettel.authsync.service.implement;

import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Service;

import com.viettel.authsync.dto.request.RoleRequest;
import com.viettel.authsync.dto.response.RoleResponse;
import com.viettel.authsync.repository.PermissionRepository;
import com.viettel.authsync.repository.RoleRepository;
import com.viettel.authsync.service.RoleService;
import com.viettel.authsync.service.mapper.RoleMapper;

@Service
public class RoleServiceImpl implements RoleService {
    RoleRepository roleRepository;
    PermissionRepository permissionRepository;
    RoleMapper roleMapper;

    public RoleResponse create(RoleRequest request) {
        var role = roleMapper.toRole(request);

        role = roleRepository.save(role);
        return roleMapper.toRoleResponse(role);
    }

    public List<RoleResponse> getAll() {
        return roleRepository.findAll().stream().map(roleMapper::toRoleResponse).toList();
    }

    public void delete(String role) {
        roleRepository.deleteById(role);
    }
}

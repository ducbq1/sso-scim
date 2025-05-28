package com.viettel.authsync.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.viettel.authsync.domain.Permission;
import com.viettel.authsync.dto.request.PermissionRequest;
import com.viettel.authsync.dto.response.PermissionResponse;
import com.viettel.authsync.repository.PermissionRepository;
import com.viettel.authsync.service.PermissionService;
import com.viettel.authsync.service.mapper.PermissionMapper;

@Service
public class PermissionServiceImpl implements PermissionService {
    PermissionRepository permissionRepository;
    PermissionMapper permissionMapper;

    public PermissionResponse create(PermissionRequest request) {
        Permission permission = permissionMapper.toPermission(request);
        permission = permissionRepository.save(permission);
        return permissionMapper.toPermissionResponse(permission);
    }

    public List<PermissionResponse> getAll() {
        var permissions = permissionRepository.findAll();
        return permissions.stream().map(permissionMapper::toPermissionResponse).toList();
    }

    public void delete(String permission) {
        permissionRepository.deleteById(permission);
    }
}

package lol.maki.dev.todo.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import lol.maki.dev.todo.domain.Permission;
import lol.maki.dev.todo.dto.request.PermissionRequest;
import lol.maki.dev.todo.dto.response.PermissionResponse;
import lol.maki.dev.todo.repository.PermissionRepository;
import lol.maki.dev.todo.service.PermissionService;
import lol.maki.dev.todo.service.mapper.PermissionMapper;

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

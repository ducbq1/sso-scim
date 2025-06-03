package lol.maki.dev.todo.service;

import java.util.List;

import lol.maki.dev.todo.dto.request.PermissionRequest;
import lol.maki.dev.todo.dto.response.PermissionResponse;

public interface PermissionService {
    PermissionResponse create(PermissionRequest request);

    List<PermissionResponse> getAll();

    void delete(String permission);
}

package com.viettel.authsync.service;

import java.util.List;

import com.viettel.authsync.dto.request.PermissionRequest;
import com.viettel.authsync.dto.response.PermissionResponse;

public interface PermissionService {
    PermissionResponse create(PermissionRequest request);

    List<PermissionResponse> getAll();

    void delete(String permission);
}

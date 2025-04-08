package com.viettel.authsync.service;

import java.util.List;

import com.viettel.authsync.dto.request.RoleRequest;
import com.viettel.authsync.dto.response.RoleResponse;

public interface RoleService {
    public RoleResponse create(RoleRequest request);

    public List<RoleResponse> getAll();

    public void delete(String role);
}

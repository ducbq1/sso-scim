package com.viettel.authsync.service;

import java.util.List;
import java.util.Map;

import com.viettel.authsync.dto.request.RoleRequest;
import com.viettel.authsync.dto.request.SearchRequest;
import com.viettel.authsync.dto.response.RoleResponse;
import org.springframework.data.domain.Page;

public interface RoleService {
    RoleResponse create(RoleRequest request);

    List<RoleResponse> getAll();

    void delete(String role);

    Page<RoleResponse> dynamicSearch(SearchRequest searchRequest);
}

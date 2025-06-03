package lol.maki.dev.todo.service;

import java.util.List;
import java.util.Map;

import lol.maki.dev.todo.dto.request.RoleRequest;
import lol.maki.dev.todo.dto.request.SearchRequest;
import lol.maki.dev.todo.dto.response.RoleResponse;
import org.springframework.data.domain.Page;

public interface RoleService {
    RoleResponse create(RoleRequest request);

    List<RoleResponse> getAll();

    void delete(String role);

    Page<RoleResponse> dynamicSearch(SearchRequest searchRequest);
}

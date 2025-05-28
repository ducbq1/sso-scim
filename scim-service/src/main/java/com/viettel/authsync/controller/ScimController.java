package com.viettel.authsync.controller;

import com.viettel.authsync.dto.request.RoleRequest;
import com.viettel.authsync.dto.request.SearchRequest;
import com.viettel.authsync.dto.response.RoleResponse;
import com.viettel.authsync.service.RoleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/scim")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ScimController {

    RoleService roleService;

    @GetMapping("/")
    public String home() {
        return "home";  // Trả về trang home
    }

    @GetMapping("/test")
    public String publicPage() {
        return "public";  // Trả về trang public không cần xác thực
    }

    @PostMapping("/test")
    public Page<RoleResponse> searchEmployees(@RequestBody SearchRequest searchRequest) {
        return roleService.dynamicSearch(searchRequest);
    }

}

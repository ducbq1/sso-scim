package lol.maki.dev.todo.controller;

import lol.maki.dev.todo.dto.request.RoleRequest;
import lol.maki.dev.todo.dto.request.SearchRequest;
import lol.maki.dev.todo.dto.response.RoleResponse;
import lol.maki.dev.todo.service.RoleService;
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

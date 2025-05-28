package com.viettel.authsync.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "home";  // Trả về trang home
    }

    @GetMapping("/oauth/authorize")
    public String publicPage() {
        return "public";  // Trả về trang public không cần xác thực
    }
}

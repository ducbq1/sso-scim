package com.viettel.authsync.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage(@RequestParam(value = "redirect_uri", required = false) String redirectUri,
                            Model model) {
        model.addAttribute("redirect_uri", redirectUri);
        return "login";
    }
}

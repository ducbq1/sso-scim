package com.viettel.authsync.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class ConsentController {

    @GetMapping("/oauth2/consent")
    public String consentPage(
            @RequestParam String client_id,
            @RequestParam String scope,
            @RequestParam String state,
            Model model) {

        List<String> scopes = Arrays.asList(scope.split(" "));
        model.addAttribute("clientId", client_id);
        model.addAttribute("scopes", scopes);
        model.addAttribute("state", state);
        return "consent";
    }
}

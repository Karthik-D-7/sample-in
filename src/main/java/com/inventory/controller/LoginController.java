package com.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @GetMapping("/forgot-password")
    public String forgotPassword() {
        return "forgot-password";
    }

    @GetMapping("/stock")
    public String stock() {
        return "stock";
    }

    @GetMapping("/orders")
    public String orders() {
        return "orders";
    }

    @GetMapping("/suppliers")
    public String suppliers() {
        return "suppliers";
    }

    @GetMapping("/customers")
    public String customers() {
        return "customers";
    }

    @GetMapping("/reports")
    public String reports() {
        return "reports";
    }

    @GetMapping("/settings")
    public String settings() {
        return "settings";
    }
} 
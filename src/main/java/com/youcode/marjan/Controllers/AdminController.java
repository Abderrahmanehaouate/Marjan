package com.youcode.marjan.Controllers;

import com.youcode.marjan.Models.Admin;
import com.youcode.marjan.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/register")
    public String registerAdmin(@RequestBody Admin admin) {
        boolean isRegistered = adminService.registerAdmin(admin);
        if (isRegistered) {
            return "Admin registered successfully";
        } else {
            return "Failed to register admin";
        }
    }

    @PostMapping("/login")
    public String loginAdmin(@RequestBody Admin admin) {
        // Logic to login admin
        return "Admin logged in successfully";
    }
}

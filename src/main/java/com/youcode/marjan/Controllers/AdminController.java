package com.youcode.marjan.Controllers;

import com.youcode.marjan.Models.Admin;
import com.youcode.marjan.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/v1/admins")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }
    @GetMapping("/")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }
    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable Long id) {
        return adminService.getAdminById(id);
    }
    @PostMapping("/create")
    public ResponseEntity<String> createAdmin(@RequestBody Admin admin) {
        adminService.saveAdmin(admin);
        return new ResponseEntity<>("Admin created successfully", HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<String> updateAdmin(@RequestBody Admin admin) {
        adminService.saveAdmin(admin);
        return new ResponseEntity<>("Admin updated successfully", HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAdminById(@PathVariable Long id) {
        adminService.deleteAdminById(id);
        return new ResponseEntity<>("Admin deleted successfully", HttpStatus.OK);
    }
}

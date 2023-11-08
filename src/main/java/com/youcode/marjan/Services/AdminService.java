package com.youcode.marjan.Services;


import com.youcode.marjan.Models.Admin;
import com.youcode.marjan.Repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public boolean registerAdmin(Admin admin) {
        // Check if the admin with the given username already exists
        if (adminRepository.findByUsername(String.valueOf(admin.getUsername() != null))) {
            // Admin with this username already exists
            return false;
        }

        // Perform necessary validations on the admin object
        // ... (validate other fields as needed)

        // Save the admin to the database
        adminRepository.save(admin);
        return true; // Admin registered successfully
    }
}

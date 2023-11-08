package com.youcode.marjan.Controllers;

import com.youcode.marjan.Models.User;
import com.youcode.marjan.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        System.out.println("create all users");
        ResponseEntity.status(HttpStatus.CREATED).body("User created successfully!");
        return userService.getAllUsers();

    }

    @PostMapping("/")
    public String createUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User created successfully";
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}


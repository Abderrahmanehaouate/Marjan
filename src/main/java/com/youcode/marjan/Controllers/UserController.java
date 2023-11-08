package com.youcode.marjan.Controllers;

import com.youcode.marjan.Models.User;
import com.youcode.marjan.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value ="/user/{id}",
    method = RequestMethod.GET,
    produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUserById(@PathVariable Long id) {
        System.out.println("welcom to this path users/{id}");
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        System.out.println("create all users");
        ResponseEntity.status(HttpStatus.CREATED).body("User created successfully!");
        return userService.getAllUsers();

    }

    @PostMapping("/user/create")
    public String createUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User created successfully";
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
    }
}


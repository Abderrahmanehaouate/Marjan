package com.youcode.marjan.Controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello, World!";
    }
}
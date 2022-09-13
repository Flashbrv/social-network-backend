package com.example.backend.controller;

import com.example.backend.dto.UserProfileDto;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/profile")
public class ProfileController {

    @Autowired
    private UserService service;

    @GetMapping("{id}")
    public ResponseEntity<UserProfileDto> findUserProfile(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserProfile(id));
    }
}

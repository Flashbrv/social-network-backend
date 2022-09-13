package com.example.backend.controller;

import com.example.backend.dto.UserDto;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<Page<UserDto>> findAll(@RequestParam(name="pageNumber", defaultValue = "0") Integer pageNumber,
                                                 @RequestParam(name = "itemsCount", defaultValue = "10") Integer itemsCount) {
        return ResponseEntity.ok(service.getAllUsers(pageNumber, itemsCount));
    }
}

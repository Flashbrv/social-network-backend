package com.example.backend.controller;

import com.example.backend.model.User;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/users")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<Page<User>> findAll(@RequestParam(name="pageNumber", defaultValue = "0") Integer pageNumber,
                                              @RequestParam(name = "itemsCount", defaultValue = "10") Integer itemsCount) {
        return ResponseEntity.ok(service.getAllUsers(pageNumber, itemsCount));
    }
}

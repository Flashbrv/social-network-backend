package com.example.backend.controller;

import com.example.backend.dto.FollowResponseDto;
import com.example.backend.dto.UserDto;
import com.example.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/users")
    //@PreAuthorize("hasAuthority('users:read')")
    public ResponseEntity<Page<UserDto>> findAll(@RequestParam(name="pageNumber", defaultValue = "0") Integer pageNumber,
                                                 @RequestParam(name = "itemsCount", defaultValue = "10") Integer itemsCount) {

        return ResponseEntity.ok(
                service.getAllUsers(pageNumber, itemsCount));
    }

    @GetMapping("/follow/{userId}")
    public ResponseEntity<FollowResponseDto> getUserFollowStatus(@PathVariable Long userId) {
        return ResponseEntity.ok(
                service.getFollowStatusForUser(userId));
    }

    @PostMapping("/follow/{userId}")
    public ResponseEntity<FollowResponseDto> followUser(@PathVariable Long userId) {
        return ResponseEntity.ok(
                service.followUser(userId));
    }

    @DeleteMapping("/follow/{userId}")
    public ResponseEntity<FollowResponseDto> unfollowUser(@PathVariable Long userId) {
        return ResponseEntity.ok(
                service.unfollowUser(userId));
    }
}

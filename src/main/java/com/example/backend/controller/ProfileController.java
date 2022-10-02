package com.example.backend.controller;

import com.example.backend.dto.UserAboutTextDto;
import com.example.backend.dto.UserProfileDto;
import com.example.backend.entity.User;
import com.example.backend.security.SecurityUser;
import com.example.backend.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/profile")
public class ProfileController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('users:read')")
    public ResponseEntity<UserProfileDto> findUserProfile(@PathVariable Long id) {
        return ResponseEntity.ok(
                service.getUserProfile(id));
    }

    @GetMapping("/status/{id}")
    @PreAuthorize("hasAuthority('users:read')")
    public ResponseEntity<String> getUserAboutText(@PathVariable Long id) {
        return ResponseEntity.ok(
                service.getUserAboutText(id));
    }

    @PutMapping("/status")
    @PreAuthorize("hasAuthority('users:write')")
    public ResponseEntity<String> setUserAboutText(@RequestBody UserAboutTextDto aboutTextDto) {
        return ResponseEntity.ok(
                service.setUserAboutText(aboutTextDto.aboutText));
    }
}

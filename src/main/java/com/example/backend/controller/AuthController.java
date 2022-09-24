package com.example.backend.controller;

import com.example.backend.dto.AuthenticationRequestDto;
import com.example.backend.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequestMapping("api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthenticationRequestDto requestDto) {
        try {
            log.info("User {} tries to login", requestDto.getEmail());
            return ResponseEntity.ok(authService.login(requestDto));
        } catch (AuthenticationException ex) {
            log.info("User {} can't login", requestDto.getEmail());
            return new ResponseEntity<>("Invalid email or password", HttpStatus.FORBIDDEN);
        }
    }

    @PostMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication auth) {
        log.info("User {} tries to logout", SecurityContextHolder.getContext().getAuthentication());
        authService.logout(request, response, auth);
        log.info("User {} logout", SecurityContextHolder.getContext().getAuthentication());
    }
}

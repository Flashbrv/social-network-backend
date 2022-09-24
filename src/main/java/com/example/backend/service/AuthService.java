package com.example.backend.service;

import com.example.backend.dto.AuthenticationRequestDto;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface AuthService {
    Map<Object, Object> login(AuthenticationRequestDto request);
    void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication);
}

package com.example.backend.service;

import com.example.backend.dto.AuthenticationRequestDto;
import com.example.backend.dto.AuthenticationResponseDto;
import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;
import com.example.backend.security.JwtTokenProvider;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserRepository repository;
    private final JwtTokenProvider jwtTokenProvider;

    public AuthServiceImpl(AuthenticationManager authenticationManager,
                           UserRepository repository,
                           JwtTokenProvider jwtTokenProvider) {
        this.authenticationManager = authenticationManager;
        this.repository = repository;
        this.jwtTokenProvider = jwtTokenProvider;
    }


    @Override
    public Map<Object, Object> login(AuthenticationRequestDto requestDto) {

            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(requestDto.getEmail(), requestDto.getPassword()));

            User user = repository.findByEmail(requestDto.getEmail())
                    .orElseThrow(() -> new UsernameNotFoundException("User doesn't exists"));

            String token = jwtTokenProvider.createToken(requestDto.getEmail(), user.getRole().name());
            Map<Object, Object> response = new HashMap<>();
            AuthenticationResponseDto responseDto = new AuthenticationResponseDto();
            responseDto.email = requestDto.getEmail();
            responseDto.id = user.getId();
            responseDto.token = token;
            response.put("data", responseDto);

            return response;

    }

    @Override
    public void logout(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
        SecurityContextLogoutHandler securityContextLogoutHandler = new SecurityContextLogoutHandler();
        securityContextLogoutHandler.logout(request, response, authentication);
    }
}

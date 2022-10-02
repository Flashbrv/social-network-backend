package com.example.backend.controller;

import com.example.backend.dto.PostDto;
import com.example.backend.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/posts")
@PreAuthorize("hasAuthority('users:write')")
public class PostController {
    @Autowired
    private PostService service;

    @GetMapping
    public ResponseEntity<?> getPosts() {
        return ResponseEntity.ok(
                service.getPosts());
    }

    @PostMapping
    public ResponseEntity<?> addPost(@RequestBody PostDto postDto) {
        return ResponseEntity.ok(
                service.addPost(postDto));
    }
}

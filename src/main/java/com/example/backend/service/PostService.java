package com.example.backend.service;

import com.example.backend.dto.PostDto;

import java.util.List;

public interface PostService {
    List<PostDto> getPosts();
    PostDto addPost(PostDto postDto);
}

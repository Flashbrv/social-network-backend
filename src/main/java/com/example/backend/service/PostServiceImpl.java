package com.example.backend.service;

import com.example.backend.dto.PostDto;
import com.example.backend.entity.Post;
import com.example.backend.mapper.PostMapper;
import com.example.backend.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class PostServiceImpl implements PostService {

    private final PostRepository repository;
    private final AuthService authService;
    private final PostMapper mapper;

    public PostServiceImpl(PostRepository repository, AuthService authService, PostMapper mapper) {
        this.repository = repository;
        this.authService = authService;
        this.mapper = mapper;
    }

    @Override
    public List<PostDto> getPosts() {
        Long userId = authService.getCurrentLoggedUserId();
        log.info("User with id={} request posts", userId);
        return repository
                .findByUserId(userId)
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public PostDto addPost(PostDto postDto) {
        Long userId = authService.getCurrentLoggedUserId();
        Post post = mapper.toEntity(postDto);
        post.setUserId(userId);

        log.info("User tries to save post={}", post);
        Post savedPost = repository.save(post);
        log.info("Return to user saved post={}", savedPost);
        return mapper.toModel(savedPost);
    }
}

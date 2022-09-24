package com.example.backend.repository;

import com.example.backend.dto.UserDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDAO {
    Page<UserDto> getAllForUser(Long userId, Pageable page);
    boolean isFollowed(Long currentUserId, Long followedUserId);
    int follow(Long currentUserId, Long followedUserId);
    int unfollow(Long currentUserId, Long followedUserId);
}

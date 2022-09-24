package com.example.backend.service;

import com.example.backend.dto.FollowResponseDto;
import com.example.backend.dto.UserDto;
import com.example.backend.dto.UserProfileDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
//    User getUsedByName(String userName);
//    User getUsedById(long id);
    Page<UserDto> getAllUsers(Integer pageNumber, Integer itemsCount);
    Page<UserDto> getAllUserForCurrentUser(Long currentUserId, Pageable page);
    UserProfileDto getUserProfile(Long userId);

    FollowResponseDto getFollowStatusForUser(Long userId);

    FollowResponseDto followUser(Long userId);

    FollowResponseDto unfollowUser(Long userId);
}

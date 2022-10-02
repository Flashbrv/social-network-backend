package com.example.backend.service;

import com.example.backend.dto.FollowResponseDto;
import com.example.backend.dto.UserDto;
import com.example.backend.dto.UserProfileDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<UserDto> getAllUsers(Integer pageNumber, Integer itemsCount);
    UserProfileDto getUserProfile(Long profileUserId);

    FollowResponseDto getFollowStatusForUser(Long followUserId);

    FollowResponseDto followUser(Long userId);

    FollowResponseDto unfollowUser(Long userId);

    String getUserAboutText(Long userId);

    String setUserAboutText(String aboutText);
}

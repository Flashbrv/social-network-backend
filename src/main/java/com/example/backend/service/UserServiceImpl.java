package com.example.backend.service;

import com.example.backend.dto.FollowResponseDto;
import com.example.backend.dto.UserDto;
import com.example.backend.dto.UserProfileDto;
import com.example.backend.entity.User;
import com.example.backend.mapper.UserMapper;
import com.example.backend.mapper.UserProfileMapper;
import com.example.backend.repository.UserDAO;
import com.example.backend.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserProfileMapper profileMapper;

    @Override
    public Page<UserDto> getAllUsers(Integer pageNumber, Integer itemsCount) {
        PageRequest pageRequest = PageRequest.of(pageNumber, itemsCount);

        long currentUserId = getCurrentLoggedUserId();
        log.info("Request all users. Page number: {}, items count: {}", pageNumber, itemsCount);
        return getAllUserForCurrentUser(currentUserId, pageRequest);
    }

    private long getCurrentLoggedUserId() {
        long userId = 0;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated()) {
            if (authentication.getPrincipal() instanceof String) {
                userId = 0L;
                log.info("Current user is unauthenticated");
            } else {
                UserDetails userDetails = (UserDetails) authentication.getPrincipal();
                userId = repository.findIdByEmail(userDetails.getUsername()).orElse(1L);
            }
        }
        log.info("Current logged user id={}", userId);
        return userId;
    }

    @Override
    public Page<UserDto> getAllUserForCurrentUser(Long currentUserId, Pageable page) {
        return userDAO.getAllForUser(currentUserId, page);
    }

    @Override
    public UserProfileDto getUserProfile(Long userId) {
        return profileMapper.toModel(repository.findById(userId).get());
    }

    @Override
    public FollowResponseDto getFollowStatusForUser(Long userId) {
        Long currentUserId = getCurrentLoggedUserId();
        FollowResponseDto response = new FollowResponseDto();
        response.messages = new String[1];

        if (userDAO.isFollowed(currentUserId, userId)) {
            response.resultCode = 0;
            response.messages[0] = "You follow user with id=" + userId;
            log.info("Current user follow user with id={}", userId);
            return response;
        }

        response.resultCode = 0;
        response.messages[0] = "You don't follow user with id=" + userId;
        log.info("Current user don't follow user with id={}", userId);
        return response;
    }

    @Override
    public FollowResponseDto followUser(Long userId) {
        Long currentUserId = getCurrentLoggedUserId();
        FollowResponseDto response = new FollowResponseDto();
        response.messages = new String[1];

        if (userDAO.follow(currentUserId, userId) != 1) {
            response.resultCode = 1;
            response.messages[0] = "You followed user with id=" + userId;
            log.info("User with id={} currently followed user with id={}", currentUserId, userId);
            return response;
        }

        response.resultCode = 0;
        response.messages[0] = "You follow user with id=" + userId;
        log.info("Current user follow user with id={}", userId);
        return response;
    }

    @Override
    public FollowResponseDto unfollowUser(Long userId) {
        Long currentUserId = getCurrentLoggedUserId();
        FollowResponseDto response = new FollowResponseDto();
        response.messages = new String[1];

        if (userDAO.unfollow(currentUserId, userId) != 1) {
            response.resultCode = 1;
            response.messages[0] = "You don't follow user with id=" + userId;
            log.info("Current user tries unfollow user with id={}", userId);
            return response;
        }

        response.resultCode = 0;
        response.messages[0] = "You unfollow user with id=" + userId;
        log.info("Current user unfollow user with id={}", userId);
        return response;
    }
}

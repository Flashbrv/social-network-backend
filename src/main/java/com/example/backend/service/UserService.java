package com.example.backend.service;

import com.example.backend.dto.UserDto;
import com.example.backend.dto.UserProfileDto;
import org.springframework.data.domain.Page;

public interface UserService {
//    User getUsedByName(String userName);
//    User getUsedById(long id);
    Page<UserDto> getAllUsers(Integer pageNumber, Integer itemsCount);
    UserProfileDto getUserProfile(Long userId);
}

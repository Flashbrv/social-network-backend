package com.example.backend.service;

import com.example.backend.dto.UserDto;
import com.example.backend.dto.UserProfileDto;
import com.example.backend.entity.User;
import com.example.backend.mapper.UserMapper;
import com.example.backend.mapper.UserProfileMapper;
import com.example.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserProfileMapper profileMapper;

    @Override
    public Page<UserDto> getAllUsers(Integer pageNumber, Integer itemsCount) {
        PageRequest pageRequest = PageRequest.of(pageNumber, itemsCount);

        Page<User> userEntitiesPage = repository.findAll(pageRequest);
        Page<UserDto> usersPage = userEntitiesPage.map(userMapper::toModel);
        return usersPage;
    }

    @Override
    public UserProfileDto getUserProfile(Long userId) {
        return profileMapper.toModel(repository.findById(userId).get());
    }
}

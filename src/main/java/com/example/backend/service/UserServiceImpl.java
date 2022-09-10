package com.example.backend.service;

import com.example.backend.entity.UserEntity;
import com.example.backend.mapper.UserMapper;
import com.example.backend.mapper.UserProfileMapper;
import com.example.backend.model.Location;
import com.example.backend.model.User;
import com.example.backend.model.UserProfile;
import com.example.backend.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEntityRepository repository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserProfileMapper profileMapper;

    @Override
    public Page<User> getAllUsers(Integer pageNumber, Integer itemsCount) {
        PageRequest pageRequest = PageRequest.of(pageNumber, itemsCount);

        Page<UserEntity> userEntitiesPage = repository.findAll(pageRequest);
        Page<User> usersPage = userEntitiesPage.map(userMapper::toModel);
        return usersPage;
    }

    @Override
    public UserProfile getUserProfile(Long userId) {
        return profileMapper.toModel(repository.findById(userId).get());
    }
}

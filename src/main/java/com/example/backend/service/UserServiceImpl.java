package com.example.backend.service;

import com.example.backend.entity.UserEntity;
import com.example.backend.model.Location;
import com.example.backend.model.User;
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

    @Override
    public Page<User> getAllUsers(Integer pageNumber, Integer itemsCount) {
        PageRequest pageRequest = PageRequest.of(pageNumber, itemsCount);

        Page<UserEntity> userEntitiesPage = repository.findAll(pageRequest);
        Page<User> usersPage = userEntitiesPage.map(u -> {
            User user = new User();
            user.setId(u.getId());
            user.setFullName(u.getFullName());
            user.setAboutText(u.getAboutText());
            user.setLocation(new Location(u.getLocation().getCity(), u.getLocation().getCountry()));
            return user;
        });
        return usersPage;
    }
}

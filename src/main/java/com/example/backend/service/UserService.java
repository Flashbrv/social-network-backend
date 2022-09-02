package com.example.backend.service;

import com.example.backend.model.User;
import org.springframework.data.domain.Page;

public interface UserService {
//    User getUsedByName(String userName);
//    User getUsedById(long id);
    Page<User> getAllUsers(Integer pageNumber, Integer itemsCount);
}

package com.post.service.service;

import com.post.service.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void createUser(User user);
    List<User> findAllUsers();
    Optional <User> findUserByMobileNumber(String mobileNumber);
    Optional <User> findUserByEmail(String email);
    void updateUserByMobileNumber(User user, String mobileNumber);
    void updateUserByEmail(User user, String email);
    void deleteUserByMobileNumber(String mobileNumber);
}

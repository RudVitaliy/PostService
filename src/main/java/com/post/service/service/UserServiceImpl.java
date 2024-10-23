package com.post.service.service;

import com.post.service.model.User;
import com.post.service.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();

    }

    @Override
    public Optional<User> findUserByMobileNumber(String mobileNumber) {
         return userRepository.findUserByMobileNumber(mobileNumber);
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public void updateUserByMobileNumber(User user, String mobileNumber) {
        user.setMobileNumber(mobileNumber);
        userRepository.save(user);
    }

    @Override
    public void updateUserByEmail(User user, String email) {
        user.setEmail(email);
        userRepository.save(user);
    }

    @Override
    public void deleteUserByMobileNumber(String mobileNumber) {
        userRepository.deleteUserByMobileNumber(mobileNumber);
    }
}

package com.post.service.repository;

import com.post.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional <User> findUserByMobileNumber(String mobile);
    Optional <User> findUserByEmail(String email);
    void deleteUserByMobileNumber(String mobileNumber);
}

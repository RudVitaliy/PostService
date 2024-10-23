package com.post.service.controller;

import com.post.service.model.User;
import com.post.service.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public String createUser(@RequestBody User user){
        userService.createUser(user);
        return "User with the phone number " + user.getMobileNumber() + " was successfully created";
    }

    @GetMapping("/findAll")
    public List<User> findAll(){
        return userService.findAllUsers();
    }

    @GetMapping("/findByMobileNumber/{mobileNumber}")
    public User findUserByMobileNumber(@PathVariable String mobileNumber){
        return userService.findUserByMobileNumber(mobileNumber).orElse(null);
    }

    @GetMapping("/findByEmail/{email}")
    public User findUserByEmail(@PathVariable String email){
        return userService.findUserByEmail(email).orElse(null);
    }

    @PatchMapping("/updateByMobileNumber/{mobileNumber}")
    public String updateUserByMobileNumber(@PathVariable String mobileNumber, @RequestBody User user){
        userService.updateUserByMobileNumber(user, mobileNumber);
        return "User was successfully updated";
    }

    @PatchMapping("/updateByEmail/{email}")
    public String updateUserByEmail(@PathVariable String email, @RequestBody User user){
        userService.updateUserByEmail(user, email);
        return "User was successfully updated";
    }

    @DeleteMapping("/delete/{mobileNumber}")
    public String deleteUser(@PathVariable String mobileNumber){
        userService.deleteUserByMobileNumber(mobileNumber);
        return "User was successfully deleted";
    }

}

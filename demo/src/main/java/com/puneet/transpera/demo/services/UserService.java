package com.puneet.transpera.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puneet.transpera.demo.entity.User;
import com.puneet.transpera.demo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String saveUser(
            String username,
            String email,
            String password
    ) {
        User user = new User();

        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        userRepository.save(user);

        return "User Registered Successfully";
    }
    public User loginUser(
            String username,
            String password
    ) {
        User user = userRepository.findByUsername(username);
        if (user == null || user.getUsername() == null) {
            return null;
        }
        if(user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
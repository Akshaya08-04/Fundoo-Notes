package com.fundoonotes.service.impl;

import com.fundoonotes.dto.UserRegisterRequest;
import com.fundoonotes.dto.UserResponse;
import com.fundoonotes.entity.User;
import com.fundoonotes.exception.UserAlreadyExistsException;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse register(UserRegisterRequest request) {
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException("Email already registered");
        }

        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        User saved = userRepository.save(user);
        return new UserResponse(saved.getId(), saved.getFirstName(), saved.getEmail(), "User registered successfully");
    }
}

package com.fundoonotes.service;

import com.fundoonotes.dto.UserRegisterRequest;
import com.fundoonotes.dto.UserResponse;

public interface UserService {
    UserResponse register(UserRegisterRequest request);
}

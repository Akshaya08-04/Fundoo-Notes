package com.fundoonotes.service;

import com.fundoonotes.dto.*;

public interface UserService {
    UserResponse register(UserRegisterRequest request);
    LoginResponse login(LoginRequest request);
}

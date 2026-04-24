package com.fundoonotes.util;

import com.fundoonotes.entity.User;
import com.fundoonotes.exception.UserNotFoundException;
import com.fundoonotes.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class AuthUtil {
    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;

    public AuthUtil(JwtUtil jwtUtil, UserRepository userRepository) {
        this.jwtUtil = jwtUtil;
        this.userRepository = userRepository;
    }

    public User getUserFromToken(String authHeader) {
        String token = authHeader.replace("Bearer ", "");
        Long userId = jwtUtil.extractUserId(token);
        return userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("Invalid token user"));
    }
}

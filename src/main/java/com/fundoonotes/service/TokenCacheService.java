package com.fundoonotes.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class TokenCacheService {

    private final Map<String, String> tokenCache = new HashMap<>();

    public void saveToken(String email, String token) {
        tokenCache.put(email, token);
    }

    public String getToken(String email) {
        return tokenCache.get(email);
    }

    public void removeToken(String email) {
        tokenCache.remove(email);
    }
}

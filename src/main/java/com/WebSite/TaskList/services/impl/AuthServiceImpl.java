package com.WebSite.TaskList.services.impl;

import com.WebSite.TaskList.services.AuthService;
import com.WebSite.TaskList.web.dto.auth.JwtRequest;
import com.WebSite.TaskList.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }

}

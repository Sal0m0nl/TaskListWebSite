package com.WebSite.TaskList.services;

import com.WebSite.TaskList.web.dto.auth.JwtRequest;
import com.WebSite.TaskList.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}

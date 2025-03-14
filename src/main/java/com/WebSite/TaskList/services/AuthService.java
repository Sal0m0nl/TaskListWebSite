package com.WebSite.TaskList.services;

public interface AuthService {

    JwtResponse login(JwtRequest longRequest);

    JwtResponse refresh(String refreshToken);

}

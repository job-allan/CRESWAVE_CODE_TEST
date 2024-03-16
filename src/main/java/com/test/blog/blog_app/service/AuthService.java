package com.test.blog.blog_app.service;

import com.test.blog.blog_app.payload.LoginDto;
import com.test.blog.blog_app.payload.RegisterDto;

public interface AuthService {

    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}

package com.pichincha.chapter.evaluacion.login.service.impl;

import com.pichincha.chapter.evaluacion.login.service.AuthenticationService;
import com.pichincha.chapter.evaluacion.login.service.JwtService;
import com.pichincha.chapter.evaluacion.login.service.dto.AuthenticationResponseDto;
import com.pichincha.chapter.evaluacion.login.service.dto.LoginRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final JwtService jwtService;

    @Override
    public AuthenticationResponseDto login(LoginRequestDto loginRequest) {
        return null;
    }

    @Override
    public AuthenticationResponseDto register(LoginRequestDto loginRequest) {
        return null;
    }
}

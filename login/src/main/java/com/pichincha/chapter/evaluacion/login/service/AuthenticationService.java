package com.pichincha.chapter.evaluacion.login.service;

import com.pichincha.chapter.evaluacion.login.service.dto.AuthenticationResponseDto;
import com.pichincha.chapter.evaluacion.login.service.dto.LoginRequestDto;

public interface AuthenticationService {

    AuthenticationResponseDto login(LoginRequestDto loginRequest);

    AuthenticationResponseDto register(LoginRequestDto loginRequest);
}

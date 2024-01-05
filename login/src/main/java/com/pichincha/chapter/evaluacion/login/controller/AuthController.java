package com.pichincha.chapter.evaluacion.login.controller;

import com.pichincha.chapter.evaluacion.login.service.AuthenticationService;
import com.pichincha.chapter.evaluacion.login.service.dto.AuthenticationResponseDto;
import com.pichincha.chapter.evaluacion.login.service.dto.LoginRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping(value = "login")
    public ResponseEntity<AuthenticationResponseDto> login(@RequestBody LoginRequestDto loginRequest){
        return ResponseEntity.ok(authenticationService.login(loginRequest));
    }

    @PostMapping(value = "register")
    public ResponseEntity<AuthenticationResponseDto> register(@RequestBody LoginRequestDto loginRequest){
        return ResponseEntity.ok(authenticationService.register(loginRequest));
    }

}

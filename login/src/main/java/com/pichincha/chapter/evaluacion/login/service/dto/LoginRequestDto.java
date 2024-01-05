package com.pichincha.chapter.evaluacion.login.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class LoginRequestDto {

    private String userName;
    private String password;
}

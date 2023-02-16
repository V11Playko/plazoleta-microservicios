package com.pragma.powerup.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {

    private Long idUser;
    private String nameUser;
    private String lastNameUser;
    private String DNI;
    private String phone;
    private String email;
    private String password;
}

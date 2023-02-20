package com.pragma.powerup.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@AllArgsConstructor
public class UserRequestDto {
    private Long idUser;
    private String firstName;
    private String lastName;
    private String Dni;
    private String phone;
    private String email;
    private String password;
    private String nameRole;
    private String descriptionRole;
}

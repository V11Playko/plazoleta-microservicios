package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class UserRequestDto {
    @NotNull(message="Nombre es obligatorio.")
    private String nameUser;
    @NotNull(message = "Apellido es obligatorio.")
    private String lastNameUser;
    @NotNull(message = "Documento Nacional de Identidad es obligatorio.")
    @Size(min = 8, max = 11)
    @Pattern(regexp = "/^([0-9])*$/", message = "El DNI debe de ser numerico.")
    private String DNI;
    @NotNull(message = "El numero de celular es obligatorio.")
    @Size(max = 13, message = "El numero de celular tiene un maximo de 13 caracteres.")
    @Pattern(regexp = "^(/+/d{1,3}( )?)?((/(/d{1,3}/))|/d{1,3})[- .]?/d{3,4}[- .]?/d{4}$",message = "Formato incorrecto de numero de celular.")
    private String phone;
    @NotNull(message = "El email es obligatorio.")
    @Email(message = "Debe tener una direccion valida de Email.")
    private String email;

    @NotNull(message = "El password es obligatorio.")
    private String password;
    @NotNull(message = "Id del rol es obligatorio.")
    private Long rolId;
}

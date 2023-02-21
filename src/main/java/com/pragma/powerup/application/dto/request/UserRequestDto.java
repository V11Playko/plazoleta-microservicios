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
    @NotNull(message = "El nombre es obligatorio.")
    private String firstName;
    @NotNull(message = "El apellido es obligatorio.")
    private String lastName;
    @NotNull(message = "El DNI es obligatorio.")
    @Size(max = 10, message = "Maximo 10 caracteres.")
    @Pattern(regexp = "^[\\d]{1,3}\\.?[\\d]{3,3}\\.?[\\d]{3,3}$")
    private String Dni;
    @NotNull(message = "El celular es obligatorio.")
    @Size(max = 14,min = 10,message = "El numero de caracteres es invalido.")
    @Pattern(regexp = "[+]?[0-9]{10,12}")
    private String phone;
    @NotNull(message = "El correo es obligatorio.")
    @Email(regexp = "^(.+)@(.+)$", message = "El correo es invalido.")
    private String email;
    @NotNull(message = "La contraseña es obligatoria.")
    private String password;
    private String nameRole;
    private String descriptionRole;
}

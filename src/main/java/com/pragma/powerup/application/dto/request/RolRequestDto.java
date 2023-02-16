package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class RolRequestDto {

    @NotNull(message="Nombre es obligatorio.")
    private String name_rol;
    @NotNull(message="Descripcion del rol es obligatorio.")
    private String description_rol;
}

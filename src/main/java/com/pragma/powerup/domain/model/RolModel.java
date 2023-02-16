package com.pragma.powerup.domain.model;


public class RolModel {
    private Long id_rol;
    private String name_rol;
    private String description_rol;

    public RolModel(Long id_rol, String name_rol, String description_rol) {
        this.id_rol = id_rol;
        this.name_rol = name_rol;
        this.description_rol = description_rol;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getName_rol() {
        return name_rol;
    }

    public void setName_rol(String name_rol) {
        this.name_rol = name_rol;
    }

    public String getDescription_rol() {
        return description_rol;
    }

    public void setDescription_rol(String description_rol) {
        this.description_rol = description_rol;
    }
}

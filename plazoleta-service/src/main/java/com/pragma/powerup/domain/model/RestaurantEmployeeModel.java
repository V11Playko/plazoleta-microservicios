package com.pragma.powerup.domain.model;

public class RestaurantEmployeeModel {
    private Long idPersona;
    private String field;

    public RestaurantEmployeeModel(Long idPersona, String field) {
        this.idPersona = idPersona;
        this.field = field;
    }


    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}

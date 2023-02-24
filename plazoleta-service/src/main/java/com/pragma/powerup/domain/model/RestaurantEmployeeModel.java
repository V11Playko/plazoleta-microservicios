package com.pragma.powerup.domain.model;

public class RestaurantEmployeeModel {
    private Long idRestEmployee;
    private Long idPersona;
    private String field;

    public RestaurantEmployeeModel(Long idRestEmployee, Long idPersona, String field) {
        this.idRestEmployee = idRestEmployee;
        this.idPersona = idPersona;
        this.field = field;
    }

    public Long getIdRestEmployee() {
        return idRestEmployee;
    }

    public void setIdRestEmployee(Long idRestEmployee) {
        this.idRestEmployee = idRestEmployee;
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

package com.pragma.powerup.domain.model;

public class UserModel {
    private Long idUser;
    private String nameUser;
    private String lastNameUser;
    private String DNI;
    private String phone;
    private String email;
    private String password;
    private Long rol_Id;

    public UserModel(Long idUser, String nameUser, String lastNameUser, String DNI, String phone, String email, String password, Long rol_Id) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.lastNameUser = lastNameUser;
        this.DNI = DNI;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.rol_Id = rol_Id;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRol_Id() {
        return rol_Id;
    }

    public void setRol_Id(Long rol_Id) {
        this.rol_Id = rol_Id;
    }
}

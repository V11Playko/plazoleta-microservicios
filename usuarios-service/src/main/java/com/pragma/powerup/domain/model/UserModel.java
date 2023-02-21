package com.pragma.powerup.domain.model;


import org.mindrot.jbcrypt.BCrypt;

public class UserModel {
    private Long idUser;
    private String firstName;
    private String lastName;
    private String Dni;
    private String phone;
    private String email;
    private String password;
    private RolModel role;

    public String HashedPassword(String password) {
        String hashedPassword = BCrypt.hashpw(this.password, BCrypt.gensalt());
        return hashedPassword;
    }

    public UserModel(Long idUser, String firstName, String lastName, String dni, String phone, String email, String password, RolModel role) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Dni = dni;
        this.phone = phone;
        this.email = email;
        this.password = HashedPassword(password);
        this.role = role;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
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

    public RolModel getRole() {
        return role;
    }

    public void setRole(RolModel role) {
        this.role = role;
    }
}
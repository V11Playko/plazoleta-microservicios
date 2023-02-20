package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;

    @Column( name = "nombre", length = 50)
    private String firstName;

    @Column( name = "apellido", length = 50)
    private String lastName;

    @Column( name = "Dni", length = 50)
    private String Dni;

    @Column( name = "celular")
    @Size(max = 13, message = "Size max 13")
    private String phone;

    @Column(name = "correo")
    @Email(message = "invalid email format")
    private String email;

    @Column( name = "clave")
    private String password;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    private RolEntity role;

}

package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private RestaurantEntity restaurant;
    private Long idUser;
    private String role;
}

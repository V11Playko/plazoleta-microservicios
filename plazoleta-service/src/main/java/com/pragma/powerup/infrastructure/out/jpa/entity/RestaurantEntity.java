package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestaurantEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String address;
    private EmployeeEntity owner;
    private String phone;
    private String urlLogo;
    private String nit;
    private List<DishEntity> dishes;
}

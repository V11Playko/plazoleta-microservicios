package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Long customer;
    private LocalDateTime date;
    private String status;
    private EmployeeEntity employee;
    private RestaurantEntity restaurant;
}

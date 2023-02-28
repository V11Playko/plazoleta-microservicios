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
public class OrdersDishesEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    private OrderEntity order;
    private DishEntity dish;
    private String amount;
}

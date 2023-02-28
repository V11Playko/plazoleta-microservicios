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
public class DishEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private CategoryEntity category;
    private String description;
    private Long price;
    private RestaurantEntity restaurant;
    private String urlImage;
    private boolean active;
}

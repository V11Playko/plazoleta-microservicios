package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Categoria")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryDishEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private DishEntity idCategoryDishes;
    private String nameCategory;
    private String descriptionCategory;

}

package com.pragma.powerup.infrastructure.out.jpa.entity;

import com.pragma.powerup.domain.model.CategoryDishModel;
import com.pragma.powerup.domain.model.OrdersDishesModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "platos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DishEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private OrdersDishesModel idDish;
    private String nameDish;
    private CategoryDishModel idCategory;
    private String descriptionDish;
    private String priceDish;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_restaurant")
    private RestaurantEntity restaurantDish;
    private String urlImageDish;
    private String stateDish;
}

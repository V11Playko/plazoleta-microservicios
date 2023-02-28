package com.pragma.powerup.infrastructure.out.jpa.entity;

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
    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idOrderDish")
    private OrdersDishesEntity idDish;
    private String nameDish;
    @OneToMany(mappedBy = "dish", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idCategory")
    private CategoryDishEntity id_category;
    private String descriptionDish;
    private String priceDish;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_restaurant")
    private RestaurantEntity restaurantDish;
    private String urlImageDish;
    private String stateDish;

    public OrdersDishesEntity getIdDish() {
        return idDish;
    }

    public void setIdDish(OrdersDishesEntity idDish) {
        this.idDish = idDish;
    }
}

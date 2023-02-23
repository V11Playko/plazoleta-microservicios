package com.pragma.powerup.infrastructure.out.jpa.entity;

import com.pragma.powerup.domain.model.RestaurantModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    private Long idDish;
    private String nameDish;
    private String idCategory;
    private String descriptionDish;
    private String priceDish;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_restaurant")
    private RestaurantEntity restaurantDish;
    private String urlImageDish;
    private String stateDish;
}

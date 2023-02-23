package com.pragma.powerup.infrastructure.out.jpa.entity;

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
@Table(name = "restaurantes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestaurantEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nameRestaurant;
    private String addressRestaurant;
    private String idOwner;
    private String phoneRestaurant;
    private String urlLogo;
    private String nit;
}

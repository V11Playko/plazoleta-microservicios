package com.pragma.powerup.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RestaurantRequestDto {
    private Long idRestaurant;
    private String nameRestaurant;
    private String addressRestaurant;
    private String idOwner;
    private String phoneRestaurant;
    private String urlLogo;
    private String nit;
}

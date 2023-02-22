package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.domain.model.RestaurantModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderRequestDto {
    private Long idOrder;
    private String idClient;
    private String dateOrder;
    private String stateOrder;
    private String idChef;
    private RestaurantModel restaurantOrder;
}

package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.domain.model.OrdersDishesModel;
import com.pragma.powerup.domain.model.RestaurantModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OrderRequestDto {
    // OrderDish
    private Long idDishOrder;
    private String amount;
    // ----------------------
    private String idClient;
    private String dateOrder;
    private String stateOrder;
    // RestaurantEmployee
    private Long idPersona;
    private String field;
    // ----------------------
    private RestaurantModel restaurantOrder;

}

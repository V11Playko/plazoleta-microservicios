package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.domain.model.CategoryDishModel;
import com.pragma.powerup.domain.model.OrdersDishesModel;
import com.pragma.powerup.domain.model.RestaurantModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DishRequestDto {
    //OrderDish
    private Long idOrderDish;
    private String amount;
    // ----------------------
    private String nameDish;
    // CategoryDish
    private String nameCategory;
    private String descriptionCategory;
    // ----------------------
    private String descriptionDish;
    private String priceDish;
    private RestaurantModel restaurantDish;
    private String urlImageDish;
    private String stateDish;
}

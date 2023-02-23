package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.RestaurantModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.RestaurantEntity;

public interface IRestaurantPersistencePort {
    RestaurantEntity saveRestaurant(RestaurantModel restaurantModel);
}

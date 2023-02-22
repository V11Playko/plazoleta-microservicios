package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.RestaurantModel;

public interface IRestaurantPersistencePort {
    // Cambiar Model a entity despues
    RestaurantModel saveRestaurant(RestaurantModel restaurantModel);
}

package com.pragma.powerup.application.dto.response;

import com.pragma.powerup.domain.api.IRestaurantServicePort;
import com.pragma.powerup.domain.model.RestaurantModel;
import com.pragma.powerup.domain.spi.IRestaurantPersistencePort;

public class RestaurantResponseDto implements IRestaurantServicePort {
    private final IRestaurantPersistencePort restaurantPersistencePort;

    public RestaurantResponseDto(IRestaurantPersistencePort restaurantPersistencePort) {
        this.restaurantPersistencePort = restaurantPersistencePort;
    }

    @Override
    public void saveRestaurant(RestaurantModel restaurantModel) {
        restaurantPersistencePort.saveRestaurant(restaurantModel);
    }
}

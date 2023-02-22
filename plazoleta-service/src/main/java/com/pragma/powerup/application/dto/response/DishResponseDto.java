package com.pragma.powerup.application.dto.response;

import com.pragma.powerup.domain.api.IDishServicePort;
import com.pragma.powerup.domain.model.DishModel;
import com.pragma.powerup.domain.spi.IDishPersistencePort;

public class DishResponseDto implements IDishServicePort {
    private final IDishPersistencePort dishPersistencePort;

    public DishResponseDto(IDishPersistencePort dishPersistencePort) {
        this.dishPersistencePort = dishPersistencePort;
    }

    @Override
    public void saveDish(DishModel dishModel) {
        dishPersistencePort.saveDish(dishModel);
    }
}

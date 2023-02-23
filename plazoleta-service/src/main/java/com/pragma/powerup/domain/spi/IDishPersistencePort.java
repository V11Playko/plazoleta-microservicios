package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.DishModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.DishEntity;

public interface IDishPersistencePort {
    DishEntity saveDish(DishModel dishModel);
}

package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.DishModel;

public interface IDishPersistencePort {
    // Cambiar Model a entity despues
    DishModel saveDish(DishModel dishModel);
}

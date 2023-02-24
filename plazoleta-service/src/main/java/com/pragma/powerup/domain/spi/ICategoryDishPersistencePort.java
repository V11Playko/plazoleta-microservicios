package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.CategoryDishModel;

public interface ICategoryDishPersistencePort {
    CategoryDishModel saveCategory(CategoryDishModel categoryDishModel);
}

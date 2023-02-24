package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.OrdersDishesModel;

public interface IOrdersDishesPersistencePort {
    OrdersDishesModel saveOrdersDishes(OrdersDishesModel ordersDishesModel);
}

package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.OrderModel;

public interface IOrderPersistencePort {
    // Cambiar Model a entity despues
    OrderModel saveOrder(OrderModel orderModel);
}

package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.OrderModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.OrderEntity;

public interface IOrderPersistencePort {
    OrderEntity saveOrder(OrderModel orderModel);
}

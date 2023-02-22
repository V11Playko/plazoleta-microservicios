package com.pragma.powerup.application.dto.response;

import com.pragma.powerup.domain.api.IOrderServicePort;
import com.pragma.powerup.domain.model.OrderModel;
import com.pragma.powerup.domain.spi.IOrderPersistencePort;

public class OrderResponseDto implements IOrderServicePort {
    private final IOrderPersistencePort orderPersistencePort;

    public OrderResponseDto(IOrderPersistencePort orderPersistencePort) {
        this.orderPersistencePort = orderPersistencePort;
    }

    @Override
    public void saveOrder(OrderModel orderModel) {
        orderPersistencePort.saveOrder(orderModel);
    }
}

package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.OrderRequestDto;
import com.pragma.powerup.domain.model.OrderModel;
import com.pragma.powerup.domain.model.RestaurantEmployeeModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IOrderRequestMapper {
    // OrdersDishes
    @Mapping(target = "idOrder.idDishOrder", source = "order.idDishOrder")
    @Mapping(target = "idOrder.amount", source = "order.amount")
    // RestaurantEmployee
    @Mapping(target = "idChef.idPersona", source = "order.idPersona")
    @Mapping(target = "idChef.field", source = "order.field")
    OrderModel toOrderRequest(OrderRequestDto  order);
}

package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.OrderRequestDto;
import com.pragma.powerup.domain.model.OrderModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IOrderRequestMapper {
    OrderModel toOrderRequest(OrderRequestDto orderRequestDto);
}

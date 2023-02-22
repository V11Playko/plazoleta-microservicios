package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.DishResponseDto;
import com.pragma.powerup.domain.model.DishModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IDishResponseMapper {
    DishResponseDto toResponseDish(DishModel dishModel);
}

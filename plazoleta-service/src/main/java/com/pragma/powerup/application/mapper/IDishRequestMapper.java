package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.DishRequestDto;
import com.pragma.powerup.domain.model.DishModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IDishRequestMapper {
    // OrderDish
    @Mapping(target = "idDish.idDishOrder", source = "dish.idDishOrder")
    @Mapping(target = "idDish.amount", source = "dish.amount")
    // CategoryDish
    @Mapping(target = "idCategory.nameCategory", source = "dish.nameCategory")
    @Mapping(target = "idCategory.descriptionCategory", source = "dish.descriptionCategory")
    DishModel toDishRequest(DishRequestDto dish);
}

package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.DishModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.DishEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.function.Function;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IDishEntityMapper {
    DishEntity toEntityDish(DishModel dishModel);
    DishModel toDishModel(DishEntity dishEntity);
}

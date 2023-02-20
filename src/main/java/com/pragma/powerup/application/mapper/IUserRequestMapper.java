package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.UserRequestDto;
import com.pragma.powerup.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {
    @Mapping(target = "role.nameRole", source = "user.nameRole")
    @Mapping(target = "role.descriptionRole", source = "user.descriptionRole")
    UserModel toUserRequest(UserRequestDto user);
}

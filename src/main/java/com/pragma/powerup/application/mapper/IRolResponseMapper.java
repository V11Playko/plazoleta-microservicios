package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.RolRequestDto;
import com.pragma.powerup.application.dto.response.RolResponseDto;
import com.pragma.powerup.domain.model.RolModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRolResponseMapper {
    RolResponseDto toResponseRol(RolModel rolModel);

    List<RolResponseDto> toResponseRolList(List<RolModel> rolModelList);
}

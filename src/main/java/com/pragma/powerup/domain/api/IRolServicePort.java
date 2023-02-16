package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.RolModel;

import java.util.List;

public interface IRolServicePort {
    void saveRol(RolModel rolModel);

    List<RolModel> getAllRols();
}

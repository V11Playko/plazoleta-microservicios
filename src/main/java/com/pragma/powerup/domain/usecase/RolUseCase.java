package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IRolServicePort;
import com.pragma.powerup.domain.model.RolModel;
import com.pragma.powerup.domain.spi.IRolPersistencePort;

import java.util.List;

public class RolUseCase implements IRolServicePort {
    private final IRolPersistencePort rolPersistencePort;

    public RolUseCase(IRolPersistencePort rolPersistencePort) {
        this.rolPersistencePort = rolPersistencePort;
    }

    @Override
    public void saveRol(RolModel rolModel) {
        rolPersistencePort.saveRol(rolModel);
    }

    @Override
    public List<RolModel> getAllRols() {
        return rolPersistencePort.getAllRols();
    }
}

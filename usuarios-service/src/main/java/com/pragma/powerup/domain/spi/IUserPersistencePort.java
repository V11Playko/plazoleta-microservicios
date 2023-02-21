package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.UserModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.UserEntity;

import java.util.List;

public interface IUserPersistencePort {

    UserEntity saveUser(UserModel userModel);

    List<UserModel> getAllUsers();

}

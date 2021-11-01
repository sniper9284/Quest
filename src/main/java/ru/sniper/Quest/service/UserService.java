package ru.sniper.Quest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.sniper.Quest.entity.UserEntity;
import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<UserEntity> getById(int id);
    void saveUser(UserEntity userEntity);
    void updateUser(int id, String login, int ball);
    void deleteUser(UserEntity userEntity);
    List<UserEntity> getAll();

}

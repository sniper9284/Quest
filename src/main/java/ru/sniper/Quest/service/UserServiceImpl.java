package ru.sniper.Quest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.sniper.Quest.entity.UserEntity;
import ru.sniper.Quest.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<UserEntity> getById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public void saveUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    public void updateUser(int id, String login, int ball) {
        UserEntity updateUser = userRepository.getById(id);
        updateUser.setLogin(login);
        updateUser.setBall(ball);
        userRepository.save(updateUser);
    }

    @Override
    public void deleteUser(UserEntity userEntity) {
        userRepository.delete(userEntity);
    }

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

}

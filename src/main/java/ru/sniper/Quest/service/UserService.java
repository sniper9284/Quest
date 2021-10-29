package ru.sniper.Quest.service;

import ru.sniper.Quest.dao.UserDao;
import ru.sniper.Quest.model.Result;
import ru.sniper.Quest.model.User;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public UserService() {
    }

    public User findUser(int id) {
        return userDao.findById(id);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    public Result findResultById(int id) {
        return userDao.findResultById(id);
    }
}

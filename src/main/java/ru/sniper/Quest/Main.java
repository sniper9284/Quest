package ru.sniper.Quest;

import org.hibernate.SessionFactory;
import ru.sniper.Quest.controller.HibernateUtil;
import ru.sniper.Quest.model.User;
import ru.sniper.Quest.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User();
        user.setLogin("test");
        userService.saveUser(user);
    }
}

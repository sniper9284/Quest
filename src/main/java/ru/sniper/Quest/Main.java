package ru.sniper.Quest;

import ru.sniper.Quest.model.User;
import ru.sniper.Quest.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User(1, "Снайпер", 100500);
        userService.saveUser(user);
    }
}

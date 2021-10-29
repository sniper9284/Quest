package ru.sniper.Quest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sniper.Quest.model.User;

import java.util.HashSet;
import java.util.Set;

@Controller
public class ProjectController {

    private static Set<User> users = new HashSet<>();

    @GetMapping("/user")
    public String user_home(@RequestParam(required = false) String login, Model model) {
        System.out.println("login is: " + login);
        model.addAttribute("login", login);
        model.addAttribute("users", users);
        return "user";
    }
}

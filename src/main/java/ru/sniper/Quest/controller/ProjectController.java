package ru.sniper.Quest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sniper.Quest.model.User;
import ru.sniper.Quest.service.UserService;

import java.util.HashSet;
import java.util.Set;

@Controller
public class ProjectController {

    private static Set<User> users = new HashSet<>();

    @PostMapping("/add")
    public String createUser(@ModelAttribute User user) {
        UserService userService = new UserService();
        userService.saveUser(user);
        return "redirect:/user";
    }


    @GetMapping("/user")
    public String user_home(@RequestParam(required = false) String login, Model model) {
        System.out.println("login is: " + login);
        model.addAttribute("login", login);
        //model.addAttribute("users", users);
        UserService userService = new UserService();
        userService.findAllUser();
        return "user";
    }
}

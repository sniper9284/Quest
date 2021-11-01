package ru.sniper.Quest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.sniper.Quest.entity.UserEntity;
import ru.sniper.Quest.service.UserService;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Optional<UserEntity> hello(@PathVariable Integer id) {
        return userService.getById(id);
    }

    @GetMapping("/")
    public String list(Model model) {
        List<UserEntity> users = userService.getAll();
        model.addAttribute("users", users);
        return "index";
    }
}

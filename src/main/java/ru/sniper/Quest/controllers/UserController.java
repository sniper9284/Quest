package ru.sniper.Quest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
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

    @GetMapping("/")
    public String list(Model model) {
        List<UserEntity> users = userService.getAll();
        model.addAttribute("users", users);
        model.addAttribute("user", new UserEntity());
        return "index";
    }

    @PostMapping("/")
    public String createUser(@RequestParam String login) {
        userService.saveUser(new UserEntity(login));
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(UserEntity userEntity, @PathVariable Integer id) {
        userService.getById(id);
        userService.deleteUser(userEntity);
        return "redirect:/";
    }

}


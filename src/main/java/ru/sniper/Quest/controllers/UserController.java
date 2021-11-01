package ru.sniper.Quest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;
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

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getUsers(Model model) {
        List<UserEntity> users = userService.getAll();
        model.addAttribute("users", users);
        model.addAttribute("userInfo", new UserEntity());
        return "users";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public RedirectView createUser(RedirectAttributes redirectAttributes, @ModelAttribute UserEntity userEntity) {
        userService.saveUser(userEntity);
        String message = "Created user <b>" + userEntity.getLogin() + "</b> ✨.";
        RedirectView redirectView = new RedirectView("/", true);
        redirectAttributes.addFlashAttribute("userMessage", message);
        return redirectView;
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    public String getUser(Model model, @PathVariable("id") Integer id) {
        Optional<UserEntity> userEntity = userService.getById(id);
        model.addAttribute("userInfo", userEntity);
        return "edit";
    }

/*    @RequestMapping(path = "/{id}", method = RequestMethod.POST)
    public RedirectView updateUser(RedirectAttributes redirectAttributes, @PathVariable("id") Integer id, @ModelAttribute UserEntity userEntity) {
        userService.updateUser(id, userEntity);
        String message = (userInfo.isActive() ? "Updated " : "Deleted ") + " user <b>" + userInfo.getFirstName() + " " + userInfo.getLastName() + "</b> ✨.";
        RedirectView redirectView = new RedirectView("/", true);
        redirectAttributes.addFlashAttribute("userMessage", message);
        return redirectView;
    }*/
}

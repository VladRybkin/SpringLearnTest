package ua.training.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ua.training.model.entity.User;
import ua.training.service.SecurityService;
import ua.training.service.UserService;


@Controller
@SessionAttributes(value = {"name", "currentUser"})
@Secured({"ROLE_ADMIN", "ROLE_USER"})
@RequestMapping("/users")

public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    public ModelAndView findAll(Model model) {
        ModelAndView modelAndView = new ModelAndView("users");
        model.addAttribute("userlast", userService.getUsers());
        model.addAttribute("name", "hellosession");

        return modelAndView;
    }

    @Secured({"ROLE_ADMIN", "ROLE_USER"})
    @PostMapping
    public RedirectView submit(@ModelAttribute("user") User user) {
        userService.addUser(user);

        return new RedirectView("redirect:/users");
    }




}

package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.*;

import ua.training.service.UserService;


@Controller
@SessionAttributes("name")
@RequestMapping("/sessionUser")


public class SessionUserController {

    @Autowired
    UserService userService;


    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("userlast", userService.getUsers());
        return "sessionUser";
    }

    @PostMapping
    public String remove(@RequestParam(value = "userId") Integer id) {
        if (id != null) {
            userService.removeUser(id);
        }

        return "redirect:users";
    }
}

package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;


import org.springframework.web.bind.annotation.*;

import ua.training.service.UserService;

@Secured({"ROLE_ADMIN", "ROLE_USER"})
@Controller
@SessionAttributes(value = {"name", "currentUser"})
@RequestMapping("/sessionUser")


public class SessionUserController {

    @Autowired
    UserService userService;


    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("userlast", userService.getUsers());
        return "sessionUser";
    }
    @Secured("ROLE_ADMIN")
    @PostMapping
    public String remove(@RequestParam(value = "userId") Integer id) {
        if (id != null) {
            userService.removeUser(id);
        }

        return "redirect:users";
    }


}

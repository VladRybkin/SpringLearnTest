package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import ua.training.service.impl.UserService;

@Secured({"ROLE_ADMIN", "ROLE_USER", "ROLE_ANONYMOUS"})
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


    @PostMapping
    public String remove(@RequestParam(value = "userId") Integer id) {
        if (id != null) {
            userService.removeUser(id);
        }

        return "redirect:users";
    }


}

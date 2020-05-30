package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import ua.training.model.entity.User;
import ua.training.service.SecurityService;
import ua.training.service.impl.UserService;


@Controller
@SessionAttributes("currentUser")
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    private SecurityService securityService;


    @GetMapping
    public String getLoginPage(Model model) {

        model.addAttribute("loginU2", "hello");
        model.addAttribute("loginU", userService.getUsers());
        return "loginPage";
    }


    @PostMapping
    public String Login(@ModelAttribute("userForm") User userForm, Model model) {
        securityService.autoLogin(userForm.getName(), userForm.getPassword());
        model.addAttribute("currentUser", "current name " + userForm.getName());
        return "redirect:/users";
    }


}

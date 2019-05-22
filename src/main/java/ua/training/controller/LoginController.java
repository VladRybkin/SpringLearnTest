package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Role;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ua.training.model.entity.User;
import ua.training.service.SecurityService;
import ua.training.service.UserService;


@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @Autowired
    private SecurityService securityService;

//    @Autowired
//    @Qualifier("encoder1")
//    BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping
    public String getLoginPage(Model model) {

        model.addAttribute("loginU2", "hello");
        model.addAttribute("loginU", userService.getUsers());
        return "loginPage";
    }


    @PostMapping
    public String Login(@ModelAttribute("userForm") User userForm) {
        securityService.autoLogin(userForm.getName(), userForm.getPassword());
        return "redirect:/users";
    }
}

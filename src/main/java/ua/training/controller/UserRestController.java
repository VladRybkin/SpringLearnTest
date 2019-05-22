package ua.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Version;
import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import ua.training.model.entity.User;
import ua.training.service.UserService;


@RestController
@RequestMapping("/restusers")
public class UserRestController {

    @Autowired
    UserService userService;

    @GetMapping
    String getUsers() {
        return userService.getUsers().toString();
    }

    @PostMapping("/add")
    String addUser(@RequestBody String a) {
        userService.addUser(new User(3, a));
        return a;
    }

    @PostMapping(value = "/addbody")
    String addUserBody(@RequestBody User user) {
        userService.addUser(new User(user.getId(), user.getName()));
        System.out.println();
        return user.toString();
    }

}

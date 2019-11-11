package ua.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import ua.training.model.entity.SimpleUser;
import ua.training.service.HibernateUserService;

import java.util.List;


@RequestMapping(value = "/hibernateusers")
public class HibernateUserRestController {

    @Autowired
    HibernateUserService hibernateUserService;




    @GetMapping
    public List<SimpleUser> getUsers() {

        List<SimpleUser>simpleUsers=hibernateUserService.listUsers();
        return simpleUsers;
    }


    @PostMapping
    public SimpleUser addUser(@RequestBody SimpleUser simpleUser) {
        hibernateUserService.addUser(simpleUser);
        return simpleUser;
    }
}

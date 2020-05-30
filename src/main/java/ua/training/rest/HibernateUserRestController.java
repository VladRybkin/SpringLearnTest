package ua.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.training.model.entity.SimpleUser;
import ua.training.service.HibernateUserService;

import java.util.List;


@RequestMapping(value = "/hibernateusers")
public class HibernateUserRestController {

    @Autowired
    private HibernateUserService hibernateUserService;


    @GetMapping
    public List<SimpleUser> getUsers() {

        List<SimpleUser> simpleUsers = hibernateUserService.listUsers();
        return simpleUsers;
    }


    @PostMapping
    public SimpleUser addUser(@RequestBody SimpleUser simpleUser) {
        hibernateUserService.addUser(simpleUser);
        return simpleUser;
    }
}

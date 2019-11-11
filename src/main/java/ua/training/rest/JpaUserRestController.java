package ua.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.training.model.entity.SimpleUser;
import ua.training.service.impl.UserCrudService;

import java.util.List;

@RestController

@RequestMapping("/jparestusers")
public class JpaUserRestController {


    @Autowired
    UserCrudService userCrudService;


    @GetMapping
    public List<SimpleUser> getUsers() {

        return userCrudService.findAllSimpleUsers();
    }


    @PostMapping
    public SimpleUser addUser(@RequestBody SimpleUser simpleUser) {
        userCrudService.add(simpleUser);
        return simpleUser;
    }

}

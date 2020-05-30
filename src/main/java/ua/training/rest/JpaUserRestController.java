package ua.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.training.model.entity.SimpleUser;
import ua.training.service.impl.UserCrudService;

import java.util.List;

@RestController

@RequestMapping("/jparestusers")
public class JpaUserRestController {


    @Autowired
    private UserCrudService userCrudService;


    @GetMapping
    public List<SimpleUser> getUsers() {

        return userCrudService.findAllSimpleUsers();
    }


    @PostMapping
    public SimpleUser addUser(@RequestBody SimpleUser simpleUser) {
        userCrudService.add(simpleUser);
        return simpleUser;
    }

    @DeleteMapping
    public SimpleUser removeUser(@RequestBody SimpleUser simpleUser) {
        userCrudService.remove(simpleUser);
        return simpleUser;
    }

}

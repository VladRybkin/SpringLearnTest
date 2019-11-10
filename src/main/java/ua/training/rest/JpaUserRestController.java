package ua.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.training.model.entity.SimpleUser;
import ua.training.service.impl.UserCrudService;

import java.util.List;

@RestController
@RequestMapping("/JPArestusers")
public class JpaUserRestController {


    @Autowired
    UserCrudService userCrudService;



    @GetMapping
    public List<SimpleUser> getUsers() {
        return userCrudService.findAllSimpleUsers();
    }

}

package ua.training.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.training.model.entity.RestEntity;
import ua.training.model.entity.User;
import ua.training.service.HibernateUserService;
import ua.training.service.impl.UserCrudService;
import ua.training.service.impl.UserService;

import java.util.List;


@RestController
@RequestMapping("/restusers")
public class UserRestController {

    @Autowired
    UserService userService;

    @Autowired
    UserCrudService userCrudService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<String> addUser(@RequestParam String a) {
        userService.addUser(new User(3, a));

        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    @PostMapping(value = "/addbody", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<RestEntity> addUserBody(@RequestBody RestEntity restEntity) {
        userService.addUser(new User(restEntity.getName1().length(), restEntity.getName2()));

        return new ResponseEntity<>(restEntity, HttpStatus.OK);
    }

    @PostMapping(value = "/addbody1", produces = {MediaType.APPLICATION_JSON_VALUE})
    ResponseEntity<RestEntity> addUserBody1() {
        userService.addUser(new User(3, "body1"));
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

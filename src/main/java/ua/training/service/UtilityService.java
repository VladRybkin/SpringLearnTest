package ua.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class UtilityService {
    @Autowired
    @Qualifier("UserService1")
    UserService userService;




}

package ua.training.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import static org.junit.Assert.*;

public class UserServiceTest {


    private UserService userService = new UserService();

    private UserDetailsService userDetailsService = new UserDetailsServiceImpl();

    @org.junit.Test
    public void findByUsernameAndPassword() {

        assertTrue(userService.findByUsernameAndPassword("Vlad") != null);

        System.out.println(userService.findByUsernameAndPassword("Vlad"));
    }
}
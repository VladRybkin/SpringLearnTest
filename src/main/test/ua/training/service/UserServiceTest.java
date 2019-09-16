package ua.training.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class UserServiceTest {


    private UserService userService = new UserService();

    private UserDetailsService userDetailsService = new UserDetailsServiceImpl();

    @org.junit.Test
    public void findByUsernameAndPassword() {

        assertTrue(userService.findByUsernameAndPassword("Vlad") != null);
        System.out.println(userService.findByUsernameAndPassword("Vlad"));
        UserService userService=mock(new UserService().getClass());
        System.out.println(userService.getUsers());


    }
}
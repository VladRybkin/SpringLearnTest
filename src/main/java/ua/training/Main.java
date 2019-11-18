package ua.training;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.training.model.entity.User;
import ua.training.service.impl.IOService;
import ua.training.service.impl.MultithreadingService;
import ua.training.service.impl.RestService;
import ua.training.service.impl.UserService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {
        //        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext1.getBean("user2", User.class);
        user.timesout();

    }
}









package ua.training;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.training.model.entity.User;
import ua.training.service.impl.RestService;

import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException {
        //        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("db.xml");
        User user = applicationContext1.getBean("user1", User.class);
        System.out.println(user.getName());
        //        System.out.println(getRest().getBody());
        RestService restService = new RestService();
        restService.sendGetForEntity();


    }
}









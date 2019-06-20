package ua.training;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ua.training.model.dao.HelloBuilder;
import ua.training.model.entity.User;
import ua.training.model.dao.UserDao;
import ua.training.service.UserService;

import java.util.function.Predicate;


public class Main {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("Jpa.xml");
//        UserDao userDao = applicationContext.getBean("UserDao", UserDao.class);
//        System.out.println(userDao.getUsers());


    }



}





package ua.training;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ua.training.model.dao.HelloBuilder;
import ua.training.model.entity.User;
import ua.training.model.dao.UserDao;
import ua.training.service.UserService;

import java.util.Optional;
import java.util.function.Predicate;


public class Main {




    public static void main(String[] args)  {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml", "db.xml");
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/jpa.xml");
        User user=applicationContext.getBean("user1", User.class);
        UserDao userDao=applicationContext.getBean("UserDao", UserDao.class);
        user.getId();
        user.getName();
        user.getName();
        user.getName();
        user.getName();
        user.print();
        System.out.println(user);
        UserService userService=new UserService();
         BCryptPasswordEncoder bCryptPasswordEncoder=applicationContext.getBean("encoder1", BCryptPasswordEncoder.class);

        System.out.println(bCryptPasswordEncoder.encode("encode= " + "Vlad22"));
        System.out.println(bCryptPasswordEncoder.matches("vlad22", bCryptPasswordEncoder.encode("vlad22")));
//        userDao.insertUser(10, "hello");
        HelloBuilder helloBuilder = new HelloBuilder().withAdress("gg").withAge(5).withName("buildername");
        helloBuilder.withAge(4);
        System.out.println(userDao.getUsers());

    }
     void daof(String a, String b){
         System.out.println( String.format("hello %s, %s", a, b));

    }

    static boolean userPredicate(Predicate<User>userPredicate){
        return false;
    }



    }





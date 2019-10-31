package ua.training;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import ua.training.model.dto.UserDTO;
import ua.training.model.entity.RestEntity;
import ua.training.model.entity.User;
import ua.training.service.sendRest.RestService;

import java.io.*;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {
        //        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
                ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("db.xml");
        User user=applicationContext1.getBean("user1", User.class);
        System.out.println(user.getName());
//        System.out.println(getRest().getBody());
        RestService restService=new RestService();
        restService.sendGetForEntity();
//        System.out.println(getRest().getStatusCode().isError());
//
//        System.out.println(sendPostRestEntity());


    }


}





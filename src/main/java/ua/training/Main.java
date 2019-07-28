package ua.training;


import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import ua.training.model.entity.RestEntity;


public class Main {


    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("Jpa.xml");
//        UserDao userDao = applicationContext.getBean("UserDao", UserDao.class);
//        System.out.println(userDao.getUsers());
        System.out.println(getRest().getBody());
        System.out.println(getRest().getStatusCode().isError());
//        System.out.println(sendEmptyPost().getStatusCode());
//        System.out.println(sendPost());
        System.out.println(sendPostRestEntity());

    }

    static ResponseEntity<String> getRest() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<?> httpEntity = new HttpEntity<>(requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("http://localhost:8888/restusers", HttpMethod.GET, httpEntity, String.class);
    }

    static ResponseEntity sendPost() {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
//    headers.add("Authorization", "Basic " + base64Creds);
        headers.add("Content-Type", "application/json");

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        HttpEntity<RestEntity> request = new HttpEntity<RestEntity>(new RestEntity("nae1", "nae2"), headers);

        return restTemplate.postForObject("http://localhost:8888/restusers/addbody", request, ResponseEntity.class);

    }


    static ResponseEntity sendEmptyPost() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<?> httpEntity = new HttpEntity<Object>(null, requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("http://localhost:8888/restusers/addbody1", HttpMethod.POST, httpEntity, String.class);

    }

    static ResponseEntity sendPostRestEntity() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<?> httpEntity = new HttpEntity<Object>(new RestEntity("firstname", "lastname"), requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        return restTemplate.exchange("http://localhost:8888/restusers/addbody", HttpMethod.POST, httpEntity, String.class);

    }
}





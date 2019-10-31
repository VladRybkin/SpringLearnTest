package ua.training.service.impl;

import org.springframework.http.*;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import ua.training.model.dto.UserDTO;
import ua.training.model.entity.RestEntity;

import java.util.Arrays;
import java.util.List;

@Component
public class RestService {
    public ResponseEntity<String> getRest() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<?> httpEntity = new HttpEntity<>(requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("http://localhost:8888/restusers", HttpMethod.GET, httpEntity, String.class);
    }

    public ResponseEntity sendPost() {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        //    headers.add("Authorization", "Basic " + base64Creds);
        headers.add("Content-Type", "application/json");

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

        HttpEntity<RestEntity> request = new HttpEntity<RestEntity>(new RestEntity("nae1", "nae2"), headers);

        return restTemplate.postForObject("http://localhost:8888/restusers/addbody", request, ResponseEntity.class);

    }


    public ResponseEntity sendEmptyPost() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<?> httpEntity = new HttpEntity<Object>(requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("http://localhost:8888/restusers/addbody1", HttpMethod.POST, httpEntity, String.class);

    }

    public ResponseEntity sendPostRestEntity() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<?> httpEntity = new HttpEntity<Object>(new RestEntity("fff", "lastnameff"), requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        ResponseEntity<String> responseEntity =
                restTemplate.exchange("http://localhost:8888/restusers/addbody", HttpMethod.POST, httpEntity, String.class);
        return responseEntity;

    }

    public ResponseEntity sendGetForEntity() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<?> httpEntity = new HttpEntity<Object>(new RestEntity("fff", "lastnameff"), requestHeaders);

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());


        ResponseEntity<UserDTO[]> responseEntity =
                restTemplate.getForEntity("http://localhost:8888/restusers", UserDTO[].class);
        UserDTO[]userDTOS=responseEntity.getBody();
        List<UserDTO> userDTOList= Arrays.asList(responseEntity.getBody());
        System.out.println(userDTOList);
        //        System.out.println(Arrays.toString(userDTOS));
        return responseEntity;

    }
}

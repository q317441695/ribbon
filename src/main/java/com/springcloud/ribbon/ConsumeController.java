package com.springcloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumeController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "consumer")
    public String helloConsumer(){
        return restTemplate.getForEntity("http//hello-service/hello",String.class).getBody();
    }
}

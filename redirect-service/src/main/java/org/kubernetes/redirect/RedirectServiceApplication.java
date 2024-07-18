package org.kubernetes.redirect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class RedirectServiceApplication {

    private final static String NGINX_URL = "http://nginx";
    private final static String HELLO_URL = "http://hello-service";

    private final RestTemplate restTemplate;

    public RedirectServiceApplication() {
        this.restTemplate = new RestTemplate();
    }

    @GetMapping("/")
    public String home() {
        return "Redirect service\n";
    }

    @GetMapping("/nginx")
    public String nginx() {
        ResponseEntity<String> response = restTemplate.exchange(NGINX_URL, HttpMethod.GET,
                null, new ParameterizedTypeReference<>() {});
        return response.getBody();
    }

    @GetMapping("/hello")
    public String hello() {
        ResponseEntity<String> response = restTemplate.exchange(HELLO_URL, HttpMethod.GET,
                null, new ParameterizedTypeReference<>() {});
        return response.getBody();
    }

    public static void main(String[] args) {
        SpringApplication.run(RedirectServiceApplication.class, args);
    }

}

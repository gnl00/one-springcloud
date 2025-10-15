package one.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class UserApp {
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class, args);
    }

    @GetMapping("/api/user")
    public String apiUser() {
        return "@GetMapping(\"/api/user\")";
    }

    @GetMapping("/user")
    public String user() {
        return "@GetMapping(\"/user\")";
    }
}

package one.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }

    @GetMapping("/api/order")
    public String apiOrder() {
        return "@GetMapping(\"/api/order\")";
    }

    @GetMapping("/order")
    public String order() {
        return "@GetMapping(\"/order\")";
    }
}

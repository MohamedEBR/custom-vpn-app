package net.vpm.springboot_app.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot!";
    }
}
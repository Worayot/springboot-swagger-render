package springboot_app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class WelcomeController {

    @GetMapping("/")
    @Operation(summary = "Returns hello message")
    public String home() {
        return "Hello :)";
    }

    @GetMapping("/welcome")
    @Operation(summary = "Returns welcome message")
    public String welcome() {
        return "Welcome to my first Spring Boot!";
    }
}

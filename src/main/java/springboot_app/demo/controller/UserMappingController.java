package springboot_app.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot_app.demo.model.UserMapping;

@RestController
public class UserMappingController {

    @GetMapping("/user-mapping")
    public List<UserMapping> getUserMappings() {

        return Arrays.asList(
                new UserMapping("John Brown", "Johny Brown", "john.brown@gateway.com", "johny.brown@system.com"),
                new UserMapping("Jim Green", "Jim Green", "jim.green@gateway.com", "jim.green@system.com"),
                new UserMapping("Joe Black", "Joe Black", "joe.black@gateway.com", "joe.black@system.com"),
                new UserMapping("Jim Redsss", "Jim Red", "jim.red@gateway.com", "jim.red@system.com"),
                new UserMapping("Jim Red", "Jim Red", "jim.red@gateway.com", "jim.red@system.com"),
                new UserMapping("Jim Red", "Jim Red", "jim.red@gateway.com", "jim.red@system.com")
        );
    }
}

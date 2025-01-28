package io.github.victor_vn.jmeter_article_test_login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login", method = RequestMethod.POST)
public class LoginController {

    @PostMapping
    public ResponseEntity<String> login(@RequestBody String user){
        System.out.println("user: " + user);
        return ResponseEntity.ok("User logged in: " + user);
    }
}

package com.pufflequack.pufllequack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LoginController {
@Autowired
Repository  repo;
    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User userData) {
        System.out.println(userData);
        User sacedObj = repo.save(userData);
        return  ResponseEntity.ok(sacedObj);
    }
}

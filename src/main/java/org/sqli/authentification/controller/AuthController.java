package org.sqli.authentification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sqli.authentification.entitie.User;
import org.sqli.authentification.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/Test")
public class AuthController {

    @Autowired
    private UserService service;

    @GetMapping("/auth")
    private List<User> loginAuthentification(){
        return service.loginUser();
    }
}

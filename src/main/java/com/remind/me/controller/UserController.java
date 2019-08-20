package com.remind.me.controller;

import com.remind.me.model.UserJson;
import com.remind.me.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(path = "/users")
    public void createUser(@RequestBody UserJson userJson) {
        //System.out.println("created user method called" +userJson.getFirstName());
        userService.createUser(userJson);
    }


}

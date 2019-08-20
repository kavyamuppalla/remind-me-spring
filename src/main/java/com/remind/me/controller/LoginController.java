package com.remind.me.controller;

import com.remind.me.model.LoginJson;
import com.remind.me.model.UserJson;
import com.remind.me.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping(path = "/users/{userId}/login")
    public UserJson loginUser(@RequestBody LoginJson loginJson, @PathVariable String userId) {
        System.out.println("login woriking");
        loginJson.setUserId(userId);
        return loginService.loginUser(loginJson);
    }

}

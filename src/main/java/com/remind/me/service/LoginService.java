package com.remind.me.service;

import com.remind.me.dao.UserRepository;
import com.remind.me.entity.UserTable;
import com.remind.me.model.LoginJson;
import com.remind.me.model.UserJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public UserJson loginUser(LoginJson loginJson) {


       UserTable userTable =  userRepository.findById(loginJson.getUserId()).get();
        if(userTable.getUserId().equals(loginJson.getUserId()) && userTable.getPassword().equals(loginJson.getPassword())) {
            UserJson userJson = new UserJson();
            userJson.setFirstName(userTable.getFirstName());
            userJson.setUserId(userTable.getUserId());
            userJson.setLastName(userTable.getLastName());

            return userJson;
        }
        return null;
    }
}

package com.remind.me.service;

import com.remind.me.dao.UserRepository;
import com.remind.me.entity.UserTable;
import com.remind.me.model.UserJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //from controller
    @Autowired
    private UserRepository userRepository;

    public void createUser(UserJson userJson){

        UserTable userTable = new UserTable();
        userTable.setUserId(userJson.getUserId());
        userTable.setFirstName(userJson.getFirstName());
        userTable.setLastName(userJson.getLastName());
        userTable.setPassword(userJson.getPassword());
        //query

        //create
        userRepository.save(userTable);

    }
}

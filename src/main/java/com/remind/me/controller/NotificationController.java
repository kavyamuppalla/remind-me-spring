package com.remind.me.controller;

import com.remind.me.model.NotificationJson;
import com.remind.me.model.NotificationsJson;
import com.remind.me.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping(path = "/users/{userId}/notifications")
    public void createNotification(@RequestBody NotificationJson notificationJson, @PathVariable String userId){
        System.out.println("working");
        notificationService.createNotification(notificationJson,userId);
    }

    @GetMapping(path = "/users/{userId}/notifications")
    public NotificationsJson getNotifications(@PathVariable String userId){
        System.out.println("Get working");
        return notificationService.getNotifications(userId);
    }
}

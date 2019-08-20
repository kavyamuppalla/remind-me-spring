package com.remind.me.controller;

import com.remind.me.model.EventJson;
import com.remind.me.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping(path = "/users/{userId}/events")
    public void createEvent(@RequestBody EventJson eventJson, @PathVariable String userId) {
        eventService.createEvent(eventJson);
    }
}

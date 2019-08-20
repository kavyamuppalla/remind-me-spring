package com.remind.me.service;

import com.remind.me.dao.EventRepository;
import com.remind.me.entity.EventTable;
import com.remind.me.model.EventJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    public void createEvent(EventJson eventJson) {

        EventTable eventTable = new EventTable();
        eventTable.setEventId(eventJson.getEventId());
        eventTable.setEventName(eventJson.getEventName());

        eventRepository.save(eventTable);
    }
}

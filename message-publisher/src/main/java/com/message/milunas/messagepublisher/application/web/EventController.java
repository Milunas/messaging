package com.message.milunas.messagepublisher.application.web;

import com.message.milunas.messagepublisher.publisher.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    private final Publisher publisher;

    public EventController(Publisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/event/trigger")
    public String triggerEvent() {
        publisher.trigger();
        return "TRIGGERED";
    }
}

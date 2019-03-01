package com.message.milunas.dto.event.message;

import com.message.milunas.dto.event.Event;

public class DefaultEvent implements Event {

    private String message;

    public DefaultEvent() {

    }

    public DefaultEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String getType() {
        return DefaultEvent.class.getSimpleName();
    }
}

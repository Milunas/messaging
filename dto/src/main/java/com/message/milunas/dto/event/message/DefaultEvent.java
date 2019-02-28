package com.message.milunas.dto.event.message;

import com.message.milunas.dto.event.Event;

public class DefaultEvent implements Event {

    private final String message;

    public DefaultEvent(String message) {
        this.message = message;
    }

    @Override
    public String getType() {
        return DefaultEvent.class.getName();
    }
}

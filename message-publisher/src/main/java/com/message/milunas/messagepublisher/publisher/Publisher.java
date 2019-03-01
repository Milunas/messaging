package com.message.milunas.messagepublisher.publisher;

import com.message.milunas.dto.event.Event;
import com.message.milunas.dto.event.message.DefaultEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Publisher {

    private static final Logger log = LoggerFactory.getLogger(Publisher.class);
    private final Source source;

    public Publisher(Source source) {
        this.source = source;
    }

    public void trigger() {
        log.info("Event triggered");
        Event event = new DefaultEvent("HELLO WORLD");
        Map<String, Object> headers = new HashMap<>();
        headers.put("type", event.getType());
        source.output().send(new GenericMessage<>(event, headers));
    }

}

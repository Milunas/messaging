package com.message.milunas.messagelistener.listener;

import com.message.milunas.dto.event.Event;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    private static final Logger log = LoggerFactory.getLogger(Listener.class);

    @StreamListener(target = Sink.INPUT)
    public void receive(@Payload Event event) {
        log.info("Event with type: {}", event.getType());
    }

}

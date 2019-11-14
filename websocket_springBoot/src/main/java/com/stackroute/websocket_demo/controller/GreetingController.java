package com.stackroute.websocket_demo.controller;

import com.stackroute.websocket_demo.model.Greetings;
import com.stackroute.websocket_demo.model.HelloMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/{fromName}/{toName}")
    @SendTo("/topic/{toName}")
    public Greetings greeting(@DestinationVariable String fromName, @DestinationVariable String toName,@Payload HelloMessage message) throws InterruptedException {
        System.out.println("cascadvcdvavadv***************************************");
        Thread.sleep(1000);
        return new Greetings(HtmlUtils.htmlEscape(message.getContent() + "!"));
    }
}

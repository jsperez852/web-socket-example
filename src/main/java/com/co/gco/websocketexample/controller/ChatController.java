package com.co.gco.websocketexample.controller;

import com.co.gco.websocketexample.models.ChatMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @Autowired
    private SimpMessagingTemplate template;

    @MessageMapping("/sendMessage")
    public void getMessage(@Payload ChatMessageDTO message) {
        template.convertAndSend("/topic/messages", message);
    }
}

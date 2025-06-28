package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")           // maps to /app/sendMessage
    @SendTo("/topic/messages")                // sends to subscribers of /topic/messages
    public ChatMessage sendMessage(ChatMessage message) {
        System.out.println("📩 Message received: " + message.getSender() + " - " + message.getMessage());
        return message;
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat"; // for Thymeleaf OR name of HTML in static
    }
}

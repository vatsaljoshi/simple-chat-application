package com.chat.app.controller;

import com.chat.app.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

	/**
     * Handles messages sent by clients to "/app/sendMessage".
     * 
     * - @MessageMapping("/sendMessage"):
     *     Maps incoming STOMP messages from the client (from the frontend) 
     *     that are sent to "/app/sendMessage".
     * 
     * - @SendTo("/topic/messages"):
     *     The return value from this method will be broadcast to all clients 
     *     subscribed to "/topic/messages".
     * 
     * Example Flow:
     *   1. Client sends message to "/app/sendMessage"
     *   2. Spring routes it to this method
     *   3. The returned message is sent to all subscribers of "/topic/messages"
     */
    @MessageMapping("/sendMessage")           // maps to /app/sendMessage
    @SendTo("/topic/messages")                // sends to subscribers of /topic/messages
    public ChatMessage sendMessage(ChatMessage message) {
        System.out.println("📩 Message received: " + message.getSender() + " - " + message.getMessage());
        return message;
    }
    
    /**
     * Handles HTTP GET requests to "/chat".
     * 
     * This method returns the name of the HTML page (chat.html) to be loaded when someone accesses http://localhost:8080/chat.
     * 
     * Note:
     * - If you're using Thymeleaf: chat.html should be in --> resources/templates/
     * - If it's a static HTML: should be in --> resources/static/
     */
    @GetMapping("/chat")
    public String chat() {
        return "chat"; // for Thymeleaf OR name of HTML in static
    }
}

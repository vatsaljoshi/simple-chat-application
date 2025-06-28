package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * WebSocket configuration class for enabling real-time messaging.
 * 
 * Key Points:
 * - Implements WebSocketMessageBrokerConfigurer to customize WebSocket behaviour.
 * - Annotated with @Configuration to let Spring handle this as a configuration class.
 * - Annotated with @EnableWebSocketMessageBroker to enable STOMP-based messaging.
 * - Overrides methods to: 
 * 		- Register the WebSocket endpoint at "/chat"
 * 		- Configure message routing rules (clients -> server, server -> clients)
 * 
 * @author vatsaljoshi
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
	
	/*
	 * Registers the WebSocket endpoint where clients will connect.
	 * - Endpoint: "/chat"
	 * - setAllowedOriginPatterns(): * (no CORS policy)
	 * - withSockJS(): Adds fallback support for browsers that don't support native WebSockets.
	 */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat")
                .setAllowedOriginPatterns("*") // allow all origins temporarily
                .withSockJS(); // fallback if WebSocket isn't supported
    }
    
    /*
     * Configures how messages will be routed:
     * 
     * - enableSimpleBroker("/topic"):
     * 	 enables an in-memory message broker that broadcasts messages to all subscribers of "/topic" destinations.
     * 
     * - setApplicationDestinationPrefixes("/app"):
     * 	 any message sent by the client to a destination starting with "/app" will be routed to @MessageMapping methods in controller.
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
    	registry.enableSimpleBroker("/topic"); // for broadcasting messages from servers to clients
    	registry.setApplicationDestinationPrefixes("/app"); // for routing client methods to controller methods (via @MessageMapping)
    }
}

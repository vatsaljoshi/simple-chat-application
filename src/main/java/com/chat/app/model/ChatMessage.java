package com.chat.app.model;

public class ChatMessage {
    private String sender;
    private String message;

    public ChatMessage() {}

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

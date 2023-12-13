package com.aravind.SpringBootChatGpt.Model;


import lombok.Data;
import java.util.*;

@Data
public class ChatRequest {

    private String model;
    private List<Message> messages;


    public ChatRequest(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<Message>();
        this.messages.add(new Message("user", prompt));
    }
}

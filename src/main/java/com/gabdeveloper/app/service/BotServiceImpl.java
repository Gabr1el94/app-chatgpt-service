package com.gabdeveloper.app.service;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gabdeveloper.app.model.request.BotRequest;
import com.gabdeveloper.app.model.request.ChatGptRequest;
import com.gabdeveloper.app.model.response.ChatGptResponse;

@Service
public class BotServiceImpl {
    
    private static RestTemplate restTemplate;

    public HttpEntity<ChatGptRequest> buildHttpEntity(){
        return null;
    }

    public ChatGptRequest getResponse(HttpEntity<ChatGptRequest> chatRequestHttpEntity){
        
        return null;
    }

    public ChatGptResponse askQuestion(BotRequest botRequest) {
        return null;
    }
}

package com.gabdeveloper.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabdeveloper.app.model.request.BotRequest;
import com.gabdeveloper.app.model.response.ChatGptResponse;
import com.gabdeveloper.app.service.BotServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/bot")
@RequiredArgsConstructor
public class BotController {

    private final BotServiceImpl botService;

    @PostMapping("/send")
    public ChatGptResponse sendMessage(@RequestBody BotRequest botRequest) {
        return botService.askQuestion(botRequest);
    }
}

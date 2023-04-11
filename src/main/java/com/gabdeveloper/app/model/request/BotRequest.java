package com.gabdeveloper.app.model.request;

import java.io.Serializable;

import lombok.Data;

@Data
public class BotRequest implements Serializable{
    private String message;
}

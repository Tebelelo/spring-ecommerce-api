package com.codewithmosh.store.controllers;

import com.codewithmosh.store.entities.Message1;
import com.google.gson.JsonObject;
import org.aspectj.bridge.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @RequestMapping("/hello")
    public Message1 sayHello() {
        return new Message1("Hello");

    }
}

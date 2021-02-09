package com.lak.webSocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/")
}

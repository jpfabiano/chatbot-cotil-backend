package com.jpfabiano.botcotil.controller;

import com.jpfabiano.botcotil.dto.MessageRequest;
import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class ChatBotController {
    @PostMapping
    public ResponseEntity<String> question (@RequestBody MessageRequest messageRequest){
        System.out.println(messageRequest.message());
        return ResponseEntity.status(HttpStatus.OK).body("Deu certo!");
    }
}

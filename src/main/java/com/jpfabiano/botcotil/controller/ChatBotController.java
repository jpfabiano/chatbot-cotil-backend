package com.jpfabiano.botcotil.controller;

import com.jpfabiano.botcotil.dto.MessageRequest;
import com.jpfabiano.botcotil.dto.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jpfabiano.botcotil.service.FaqService;

@RestController
@RequestMapping("/chat")
public class ChatBotController {
    @Autowired
    private FaqService faqService;

    @PostMapping
    public ResponseEntity<MessageResponse> question (@RequestBody MessageRequest messageRequest){
        String ansewr = faqService.getAnswer(messageRequest.message());
        MessageResponse response = new MessageResponse(ansewr);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}

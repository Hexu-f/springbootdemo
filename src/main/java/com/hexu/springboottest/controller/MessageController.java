package com.hexu.springboottest.controller;

import com.hexu.springboottest.model.MessageInfo;
import com.hexu.springboottest.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hexu on 2016/6/3.
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @RequestMapping("/getMessage")
    public MessageInfo getMessage(){
        MessageInfo messageInfo=messageService.getMessage().get(0);
        return messageInfo;
    }

}
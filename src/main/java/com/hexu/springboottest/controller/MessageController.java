package com.hexu.springboottest.controller;

import com.github.pagehelper.PageHelper;
import com.hexu.springboottest.model.MessageInfo;
import com.hexu.springboottest.service.MessageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hexu on 2016/6/3.
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    private static Logger logger = Logger.getLogger(MessageController.class);

    @Autowired
    private MessageService messageService;

    @RequestMapping("/getMessage")
    public List<MessageInfo> getMessage(){
        PageHelper.startPage(2,30);
        List<MessageInfo> messageInfo=messageService.getMessage();
        return messageInfo;
    }

    @RequestMapping("/logTest")
    public MessageInfo logTest(){
        MessageInfo messageInfo=messageService.getMessage().get(0);
        logger.debug("this is debug");
        logger.info("this is info");
        logger.error("this is error");
        return messageInfo;
    }



}

package com.hexu.springboottest.service.impl;

import com.hexu.springboottest.domain.MessageDomainService;
import com.hexu.springboottest.model.MessageInfo;
import com.hexu.springboottest.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hexu on 2016/6/3.
 */
@Service("messageService")
@Transactional
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDomainService messageDomainServiceImpl;

    @Override
    public List<MessageInfo> getMessage() {
        return messageDomainServiceImpl.getMessageInfo();
    }
}

package com.hexu.springboottest.domain.Impl;

import com.hexu.springboottest.dao.MessageDao;
import com.hexu.springboottest.domain.MessageDomainService;
import com.hexu.springboottest.model.MessageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hexu on 2016/6/3.
 */
@Component("messageDomainServiceImpl")
public class MessageDomainServiceImpl implements MessageDomainService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public List<MessageInfo> getMessageInfo() {
        return messageDao.getMessageInfo();
    }
}

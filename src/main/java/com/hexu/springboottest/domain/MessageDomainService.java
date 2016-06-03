package com.hexu.springboottest.domain;

import com.hexu.springboottest.model.MessageInfo;

import java.util.List;

/**
 * Created by hexu on 2016/6/3.
 */
public interface MessageDomainService {
    List<MessageInfo> getMessageInfo();
}

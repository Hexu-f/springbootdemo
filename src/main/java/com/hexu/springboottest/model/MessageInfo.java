package com.hexu.springboottest.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hexu on 2016/6/3.
 */

@Getter
@Setter
public class MessageInfo {
    private String messageId;
    private String messageTitle;
    private String content;
    private String userId;
    private String userName;
    private String messageDate;
    private String messageType;
    private String sid;
}

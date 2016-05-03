package com.hexu.springboottest.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Hexu on 2016/5/3.
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

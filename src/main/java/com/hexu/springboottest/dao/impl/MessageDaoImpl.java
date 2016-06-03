package com.hexu.springboottest.dao.impl;

import com.hexu.springboottest.dao.BaseDao;
import com.hexu.springboottest.dao.MessageDao;
import com.hexu.springboottest.model.MessageInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hexu on 2016/6/3.
 */
@Repository
public class MessageDaoImpl extends BaseDao implements MessageDao {

    @Override
    public List<MessageInfo> getMessageInfo() {
        List<MessageInfo> messageInfos=this.sqlSessionTemplate.selectList("MessageInfoMapper.getAllMessage");
        return messageInfos;
    }

}

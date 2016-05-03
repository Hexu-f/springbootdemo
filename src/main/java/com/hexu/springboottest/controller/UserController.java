package com.hexu.springboottest.controller;

import com.hexu.springboottest.model.MessageInfo;
import com.hexu.springboottest.model.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Hexu on 2016/5/3.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @RequestMapping("/test")
    public String test(){
//        List<User> userList=new ArrayList<User>();
//        User u1=new User();
//        u1.setId(1);
//        u1.setName("fanghexu");
//        userList.add(u1);
//        User u2=new User();
//        u2.setId(2);
//        u2.setName("fanghexu2");
//        userList.add(u2);
        List<Integer> intlist=new ArrayList<Integer>();
        intlist.add(1);
        intlist.add(4);
        intlist.add(2);
        intlist.add(7);
        intlist.add(3);
        Collections.sort(intlist);

        System.out.println(intlist);

        return "this is user";
    }

    @RequestMapping("/getMessage")
    public MessageInfo getMessage(){
        List<MessageInfo> messageInfos=sqlSessionTemplate.selectList("MessageInfoMapper.getAllMessage");
        return messageInfos.get(0);
    }

}

package com.hexu.springboottest.rest;

import com.github.pagehelper.PageHelper;
import com.hexu.springboottest.model.MessageInfo;
import com.hexu.springboottest.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Hexu on 2016/6/14.
 */
@Path("/test")
@Component
public class RestResource {

    @Autowired
    private MessageService messageService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello")
    public String hello() {
        return "Hello World";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getMessage/{name}")
    public List<MessageInfo> getMessage(@PathParam("name") String name){
        System.out.println(name);
        PageHelper.startPage(2,30);
        List<MessageInfo> messageInfo=messageService.getMessage();
        return messageInfo;
    }




}

package com.hexu.springboottest.test;

import com.hexu.springboottest.service.MessageService;
import com.hexu.springboottest.service.impl.MessageServiceImpl;
import com.hexu.springboottest.util.ProxyUtil;

import java.lang.reflect.Proxy;

/**
 * Created by hexu on 2016/6/3.
 */
public class Appmain {
    public static void main(String args[]){
        Object proxyedObject=new MessageServiceImpl();
        ProxyUtil proxyUtils = new ProxyUtil(proxyedObject);
        MessageService proxyObject = (MessageService) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                MessageService.class.getInterfaces(), proxyUtils);
        proxyObject.getMessage();
    }
}

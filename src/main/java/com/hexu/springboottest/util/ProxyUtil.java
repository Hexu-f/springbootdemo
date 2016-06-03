package com.hexu.springboottest.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hexu on 2016/6/3.
 */
public class ProxyUtil implements InvocationHandler {

    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do sth before....");
        Object result =  method.invoke(target, args);
        System.out.println("do sth after....");
        return result;
    }

    public ProxyUtil(Object target){
        this.target=target;
    }

    public Object getTarget() {
        return target;
    }
    public void setTarget(Object target) {
        this.target = target;
    }
}

package com.hexu.springboottest.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created by Hexu on 2016/6/14.
 */
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(RequestContextFilter.class);
        packages("com.hexu.springboottest.rest");
        register(LoggingFilter.class);
    }

}

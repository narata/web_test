package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("我要来了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("我要挂了");
    }
}

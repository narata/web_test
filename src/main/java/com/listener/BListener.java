package com.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class BListener implements ServletContextAttributeListener {


    @Override
    public void attributeAdded(ServletContextAttributeEvent scab) {
        System.out.println("添加属性" + scab.getName() + "= " + scab.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scab) {
        System.out.println("移除属性");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scab) {
        System.out.println("替换属性" + scab.getName() + "=" + scab.getValue() + "->" + scab.getServletContext().getAttribute(scab.getName()));
    }
}

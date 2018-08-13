package com.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/*
 *
 * 有属性的标签
 *
 * @author narata
 *
 */

public class Tag3 extends SimpleTagSupport {



    private boolean test;

    public void setTest(boolean test) {
        this.test = test;
    }

    @Override
    public void doTag() throws JspException, IOException {
        if (test){
            this.getJspBody().invoke(null);
        }
    }
}

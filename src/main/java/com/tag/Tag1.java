package com.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTag;
import java.io.IOException;

public class Tag1 implements SimpleTag {

    private PageContext pageContext;
    private JspFragment body;

    public void doTag() throws JspException, IOException {
        pageContext.getOut().print("I am your father .");
    }

    public void setParent(JspTag jspTag) {

    }

    public JspTag getParent() {
        return null;
    }

    public void setJspContext(JspContext jspContext) {
        this.pageContext = (PageContext) jspContext;
    }

    public void setJspBody(JspFragment body) {
        this.body = body;
    }
}

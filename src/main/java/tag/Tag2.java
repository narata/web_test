package tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.Writer;

public class Tag2 extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        Writer out = this.getJspContext().getOut();
        out.write("**************<br>");
        this.getJspBody().invoke(out);
        out.write("<br>**************");
    }
}

package sndstudy.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HogeTag extends SimpleTagSupport {

	@Override
	 public void doTag() throws JspException, IOException {
		    super.doTag();
		    JspWriter out = this.getJspContext().getOut();
		    out.println("<strong>");
		    out.println("HogeHoge");
		    out.println("</strong>\n");
	  }

}

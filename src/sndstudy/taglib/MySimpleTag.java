package sndstudy.taglib;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MySimpleTag extends SimpleTagSupport {

	@Override
	 public void doTag() throws JspException, IOException {
		    super.doTag();
		    Locale.setDefault(new Locale("ja","JP","JP"));
		    Calendar cal = Calendar.getInstance();
		    SimpleDateFormat format = new SimpleDateFormat("GGGGyyyy年M月d日");
		    JspWriter out = this.getJspContext().getOut();
		    out.println("<strong>");
		    out.println(format.format(cal.getTime()));
		    out.println("</strong>\n");
	  }

}

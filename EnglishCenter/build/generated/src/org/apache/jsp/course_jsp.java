package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Khóa học</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \n");
      out.write("      \t<div id=\"content\" style=\"padding: 5% 10%; text-align: center;\">\n");
      out.write("  \t\t\t<h1>THÔNG TIN CÁC KHÓA HỌC </h1>\n");
      out.write(" \n");
      out.write("  \t\t\t<div style=\"width: 100%; padding: 5% 5%; text-align: center;\">\n");
      out.write("  \t\t<div style=\"width: 100%\">\n");
      out.write("  \t\t\t\t<img src=\"img/khoahoc1.png\" width=\"50%\">\n");
      out.write("  \t\t\t\t<div style=\"width: 50%; float: right; font-size: 1em\">\n");
      out.write("  \t\t\t\t\t<br><br> <br><h1> Khóa học trẻ em </h1>\n");
      out.write("  \t\t\t\t\t<br><a href=\"khoahoctreem.html\" title=\"\"> Xem thêm </a>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t\t\t\t<div style=\"width: 100%\">\n");
      out.write("  \t\t\t\t<img src=\"img/khoahoc2.png\" width=\"50%\">\n");
      out.write("  \t\t\t\t<div style=\"width: 50%; float: right; font-size: 1em\">\n");
      out.write("  \t\t\t\t\t<br><br> <br><h1> Khóa học THPT </h1>\n");
      out.write("  \t\t\t\t\t<br><a href=\"khoahocthpt.html\" title=\"\"> Xem thêm </a>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("  \t\t\t</div> \n");
      out.write("  \t\t\t<div style=\"width: 100%\">\n");
      out.write("  \t\t\t\t<img src=\"img/khoahoc3.png\" width=\"50%\">\n");
      out.write("  \t\t\t\t<div style=\"width: 50%; float: right; font-size: 1em\">\n");
      out.write("  \t\t\t\t\t<br><br> <br><h1> Khóa học giao tiếp </h1>\n");
      out.write("  \t\t\t\t\t<br><a href=\"khoahocgiaotiep.html\" title=\"\"> Xem thêm </a>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("  \t\t\t</div>\n");
      out.write("  \t\t\t</div> \n");
      out.write("\n");
      out.write("  \t\t</div> \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

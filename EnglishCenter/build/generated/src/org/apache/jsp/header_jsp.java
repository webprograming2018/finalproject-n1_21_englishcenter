package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title> \n");
      out.write("           <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"> \n");
      out.write("\t<link rel=\"shortcut icon\" href =\"icon/logo.jpg\" />\n");
      out.write("\t<script src=\"js/index.js\" type=\"text/javascript\" charset=\"utf-8\" async defer></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <div id=\"header\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div id=\"logo\" style=\"width:80%\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"trangchu.html\"\"><img src=\"icon/icon_logo.png\"  alt=\"Đây là logo\" heigh=\"150x\" width=\" 200px\" style=\"padding: 1em 0 ;\"> </a> \n");
      out.write("\t\t\t\t<div id = \"tentt\">\n");
      out.write("\t\t\t\t\t<h1>FIGHT ENGLISH</h1>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div> \n");
      out.write("\n");
      out.write("  \t\t\t<div id=\"menu\" class=\"center\" >\n");
      out.write("  \t\t\t\t<ul>\n");
      out.write("  \t\t\t\t\t<li>\n");
      out.write("  \t\t\t\t\t\t<a href=\"index.jsp\" > <img src=\"icon/icon_home.png\"  style=\"text-align:center;\" width=\"40px\" heigh=\"40px\"></a>\n");
      out.write("  \t\t\t\t\t\t\n");
      out.write("  \t\t\t\t\t</li>\n");
      out.write("  \t\t\t\t\t<li> \n");
      out.write("  \t\t\t\t\t\t<a href=\"intro.jsp\">Giới thiệu </a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t  \t\t\t\t</li>\n");
      out.write("\t  \t\t\t\t<li> \n");
      out.write("\t  \t\t\t\t\t<a href=\"course.jsp\">Khóa học </a> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t  \t\t\t\t</li>\n");
      out.write("\t  \t\t\t\t<li> \n");
      out.write("\t  \t\t\t\t\t<a href=\"news.jsp\">Tin tức </a>  \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t  \t\t\t\t</li>\n");
      out.write("\t  \t\t\t\t<li> \n");
      out.write("\t  \t\t\t\t\t<a href=\"share.jsp\"> Góc chia sẻ </a> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t  \t\t\t\t</li>\n");
      out.write("\t  \t\t\t\t<li> \n");
      out.write("\t  \t\t\t\t\t<a href=\"tuyendung.jsp\">Tuyển dụng </a> \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t  \t\t\t\t</li>\n");
      out.write("\t  \t\t\t</ul>\n");
      out.write("  \t\t\t</div>\t\n");
      out.write("  \t\t</div> \n");
      out.write("        <div class=\"slideshow-container\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t  <div class=\"mySlides fade\">\n");
      out.write("\t\t\t    <img src=\"img/banner_01.png\" style=\"width:70%\" >\n");
      out.write("\t\t\t    <div class=\"text\"> <span style=\"font-size: 20px\">Talkshow làm chủ Ielts, làm chủ cuộc đời </span><br> <br> Tham gia ngay talkshow:\"Làm chủ ielts, làm chủ cuộc đời\" để được chia sẻ phương pháp học tiếng anh cũng như định hướng du học và nghề nghiệp\n");
      out.write("\t\t\t    \t\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t  <div class=\"mySlides fade\">\n");
      out.write("\t\t\t    <img src=\"img/banner_02.png\" style=\"width:70%\">\n");
      out.write("\t\t\t    <div class=\"text\"> <span style=\"font-size: 20px\">Talkshow làm chủ Ielts, làm chủ cuộc đời </span><br> <br> Tham gia ngay talkshow:\"Làm chủ ielts, làm chủ cuộc đời\" để được chia sẻ phương pháp học tiếng anh cũng như định hướng du học và nghề nghiệp\n");
      out.write("\t\t\t    \t\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div> \n");
      out.write("\n");
      out.write("\t\t\t  <div class=\"mySlides fade\">\n");
      out.write("\t\t\t    <img src=\"img/banner_01.png\" style=\"width:70%\" >\n");
      out.write("\t\t\t    <div class=\"text\"> <span style=\"font-size: 20px\">Talkshow làm chủ Ielts, làm chủ cuộc đời </span><br> <br> Tham gia ngay talkshow:\"Làm chủ ielts, làm chủ cuộc đời\" để được chia sẻ phương pháp học tiếng anh cũng như định hướng du học và nghề nghiệp\n");
      out.write("\t\t\t    \t\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t  </div>\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<br>\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t<div style=\"text-align:center\">\n");
      out.write("\t\t\t  <span class=\"dot\" onclick=\"currentSlide(0)\"></span> \n");
      out.write("\t\t\t  <span class=\"dot\" onclick=\"currentSlide(1)\"></span> \n");
      out.write("\t\t\t  <span class=\"dot\" onclick=\"currentSlide(2)\"></span> \n");
      out.write("\t\t\t</div>\n");
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

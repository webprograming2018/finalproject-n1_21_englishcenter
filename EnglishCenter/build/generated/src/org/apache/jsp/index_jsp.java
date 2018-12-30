package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title> Fight English </title> \n");
      out.write("        <link rel=\"shortcut icon\" href =\"icon/logo.jpg\" />\n");
      out.write("</head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write(" \n");
      out.write("        <div id=\"content\"> \n");
      out.write("\t\t\t<div class=\"call-to-action\" > \n");
      out.write("\t\t\t\t<div style=\"text-align: center\"> \n");
      out.write("\t\t\t\t\t<h1> CHÀO MỪNG ĐẾN VỚI FIGHT ENGLISH </h1> \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<p> Fail English là tổ chức quốc tế về hợp tác văn hóa và cơ hội giáo dục của Vương quốc Anh. Chúng tôi có mặt ở sáu châu lục và trên 100 quốc gia, ngày ngày, hoạt động của chúng tôi mang cơ hội quốc tế đến với nhiều người. Hãy tìm hiểu thêm về chúng tôi..</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<div class=\"row\" style=\"padding: 5% 0 0 0\">\n");
      out.write("\t\t\t\t<div class=\"Tin_tuc\" >\n");
      out.write("\t\t\t\t\t<a href=\"course.jsp\" title=\"\"><h1 style=\"color:  #2BACE3\"> <u> KHÓA HỌC</u></h1></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-articles\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"course1.jsp\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <img src=\"img/khoahoc1.png\" alt=\"image 1\"height=\"238\" />\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF;height: 2em; text-align: center;\">\n");
      out.write("\t\t\t\t    \t<h4> Khóa học trẻ em </h4>\n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"course2.jsp\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <img src=\"img/khoahoc2.png\" alt=\"image 1\"height=\"238\" />\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF;height: 2em; text-align: center;\">\n");
      out.write("\t\t\t\t    \t<h4> Khóa học THPT </h4>\n");
      out.write("\t\t\t\t    \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"course3.jsp\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <img src=\"img/khoahoc3.png\" alt=\"image 1\"height=\"238\" />\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF;height: 2em; text-align: center;\">\n");
      out.write("\t\t\t\t    \t<h4> Khóa học giao tiếp </h4>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div> \t\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\" style=\"padding: 5% 0 0 0\">\n");
      out.write("\t\t\t\t<div class=\"Tin_tuc\" >\n");
      out.write("\t\t\t\t\t<a href=\"news.jsp\" title=\"\"><h1 style=\"color:  #2BACE3\"> <u> TIN TỨC</u></h1></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-articles\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <img src=\"img/tintuc1.png\" alt=\"image 1\"height=\"238\" />\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF;height: 5em\">\n");
      out.write("\t\t\t\t    \t<h4 style=\"text-align:center;padding-bottom: 1%\">Trung tâm nhận bằng khen </h4>\n");
      out.write("\t\t\t\t    <div>\n");
      out.write("\t\t\t\t    \tFight English vinh dự đón nhận bằng khen của Sở Giáo dục và Đào Tạo Hà Nội..\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <img src=\"img/tintuc2.png\" alt=\"image 1\" width=\"100%\" height=\"238\" />\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF; height: 5em\">\n");
      out.write("\t\t\t\t    \t<h4 style=\"text-align:center;padding-bottom: 1%\">Phương pháp mới  </h4>\n");
      out.write("\t\t\t\t    <div>\n");
      out.write("\t\t\t\t    \tFight English mang đến một phương pháp học mới giúp trẻ tư duy Tiếng Anh hiệu quả hơn...\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <img src=\"img/tintuc3.png\" alt=\"image 1\"height=\"238\" />\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF;height: 5em\">\n");
      out.write("\t\t\t\t    \t<h4 style=\"text-align:center;padding-bottom: 1%\">Hỗ trợ người tàn tật </h4>\n");
      out.write("\t\t\t\t    <div>\n");
      out.write("\t\t\t\t    \tChuyến thăm đến trung tâm bảo trợ người tàn tật của Fight English với mong muốn giúp đỡ các em.  \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div> \t\n");
      out.write("\t\t<div class=\"row\" style=\"padding: 5% 0 0 \">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"Goc_chiase\" >\n");
      out.write("\t\t\t\t<a href=\"share.jsp\" title=\"\"><h1 style=\"color:  #2BACE3;text-align: left;\"> <u>GÓC CHIA SẺ  </u></h1></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-articles\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <video src=\"img/video.mp4\" autobuffer autoloop loop controls poster=\"img/khoahoc1.png\" width=\"100%\" height=\"100%\"  ></video>\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF;height: 5em\">\n");
      out.write("\t\t\t\t    \t<h4 style=\"text-align:center;padding-bottom: 1%\">Trung tâm nhận bằng khen </h4>\n");
      out.write("\t\t\t\t    <div>\n");
      out.write("\t\t\t\t    \tFight English vinh dự đón nhận bằng khen của Sở Giáo dục và Đào Tạo Hà Nội..\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <video src=\"img/video.mp4\" autobuffer autoloop loop controls poster=\"img/tintuc1.png\" width=\"100%\" height=\"100%\"  ></video>\t\t\t\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF;height: 5em\">\n");
      out.write("\t\t\t\t    \t<h4 style=\"text-align:center;padding-bottom: 1%\">Phương pháp mới  </h4>\n");
      out.write("\t\t\t\t    <div>\n");
      out.write("\t\t\t\t    \tFight English mang đến một phương pháp học mới giúp trẻ tư duy Tiếng Anh hiệu quả hơn...\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t  <a href=\"\" title=\"\"><div class=\"item\">\n");
      out.write("\t\t\t\t    <video src=\"img/video.mp4\" autobuffer autoloop loop controls poster=\"img/tintuc2.png\" width=\"100%\" height=100%  ></video>\t\t\n");
      out.write("\t\t\t\t    <div style=\"background:#2BACE3; color: #FFFFFF;height: 5em\">\n");
      out.write("\t\t\t\t    \t<h4 style=\"text-align:center;padding-bottom: 1%\">Hỗ trợ người tàn tật </h4>\n");
      out.write("\t\t\t\t    <div>\n");
      out.write("\t\t\t\t    \tChuyến thăm đến trung tâm bảo trợ người tàn tật của Fight English với mong muốn giúp đỡ các em.  \n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t    </div>\n");
      out.write("\t\t\t\t  \n");
      out.write("\t\t\t\t  </div></a>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div> \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div> \n");
      out.write("            <div class=\"gocchiase\" style=\"padding:5%  10% 0 0   ;\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div style=\"text-align: center;\">\n");
      out.write("\t\t\t\t<br><h3> SỰ THÀNH CÔNG CỦA CÁC BẠN LÀ NIỀM HẠNH PHÚC CỦA CHÚNG TÔI !!!</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("           <div class=\"register\" >\n");
      out.write("\t\t\t\t<h2 style=\"padding:2% 0 1% 0; text-align: center; \"> ĐĂNG KÍ </h2> \n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\" Họ và tên \" size=\"30\"> \n");
      out.write("\t\t\t\t<input type=\"tel\"  placeholder=\"Số điện thoại\" size=\"30\">\n");
      out.write("\t\t\t\t<input type=\"email\"  placeholder=\"Email\" size=\"30\">\n");
      out.write("\t\t\t\t<br> <button type=\"submit\" style=\" color: white ; background: #0099ff ;border-radius:40;height: 50px; width: 100px; padding: 2% 0 0 0\"> Đăng ký </button>\n");
      out.write("\t\t\t</div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write(" \n");
      out.write("        ");

    Integer hitsCount = 
      (Integer)application.getAttribute("hitCounter");
    if( hitsCount ==null || hitsCount == 0 ){
       /* First visit */
   
       hitsCount = 1;
    }else{
       /* return visit */
     
       hitsCount += 1;
    }
    application.setAttribute("hitCounter", hitsCount);

      out.write("\n");
      out.write("<center>\n");
      out.write("<p>Total number of visits: ");
      out.print( hitsCount);
      out.write("</p>\n");
      out.write("</center>\n");
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

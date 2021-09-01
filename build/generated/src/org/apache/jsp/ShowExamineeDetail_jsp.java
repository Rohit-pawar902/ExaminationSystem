package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.entities.Examinee;
import com.tech.dao.ExamineeDAO;
import java.util.ArrayList;
import com.tech.entities.Student;
import com.tech.helper.ConnectionProvider;
import java.sql.Connection;
import com.tech.dao.StudentDAO;

public final class ShowExamineeDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table class=\" table-borderless table-hover table-striping\" cellpadding=\"8px\">\n");
      out.write("            <tr>\n");
      out.write("                <th class=\"jkm text-center\" colspan=\"8\">Examinee Detail</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th class=\"jkm test-center h6\">ID:</th>\n");
      out.write("                <th class=\"jkm test-center h6\">Name:</th>\n");
      out.write("                <th class=\"jkm test-center h6\">Email:</th>\n");
      out.write("                <th class=\"jkm test-center h6\">Password:</th>\n");
      out.write("                <th class=\"jkm test-center h6\">Gender:</th>\n");
      out.write("                <th class=\"jkm test-center h6\">Field:</th>\n");
      out.write("                <th class=\"jkm test-center h6\">Mobile:</th>\n");
      out.write("                <th class=\"jkm test-center h6\">Registration Date:</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                ExamineeDAO dao = new ExamineeDAO(ConnectionProvider.getConnection());
                ArrayList<Examinee> arr = dao.showDetail();
                for (Examinee s : arr) {
            
      out.write("\n");
      out.write("\n");
      out.write("            <tr class=\"h6 info\">\n");
      out.write("                <td>");
      out.print(s.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s.getEmail());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s.getPassword());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s.getGender());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s.getField());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s.getMobile());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( s.getRdate());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

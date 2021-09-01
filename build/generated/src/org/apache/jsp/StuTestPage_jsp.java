package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.tech.entities.Question;
import com.tech.dao.ExaminationDAO;
import com.tech.dao.ExamineeExaminationDAO;
import com.tech.helper.ConnectionProvider;

public final class StuTestPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Ds</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"./bo/css/bootstrap.min.css\" >\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("   <style type=\"text/css\">\n");
      out.write("   \tbody{\n");
      out.write("   \t\tbackground-image: url(./images/pg.jpg);\n");
      out.write("   \t}\n");
      out.write("   </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<br>\n");
      out.write("\t<u style=\"color:yellow\"><h1 class=\"text-color text-primary\" align=\"center\"> Datastructure tecnical QUize</h1></u>\n");
      out.write("\t\t<br>\n");
      out.write("\t<div style=\"color: white\"> \n");
      out.write("\t<hr>\n");
      out.write("\t</div>\n");
      out.write("\t<h2 style=\"color: yellow\"> welcome student have a great test</h2>\n");
      out.write("\t<br>\n");
      out.write("\t</div >\n");
      out.write("\t<div class=\"col-lg-8 m-auto d-block\">\n");
      out.write("\n");
      out.write("\t<div class=\"card\">\n");
      out.write("\t\t<h3 class=\"text-center card-header\">Welcome user you have mandatory to attempt every que</h3>\n");
      out.write("\t</div>\n");
      out.write("\t<br>\n");
      out.write("\t<form method=\"post\" action=\"check.php\">\n");
      out.write("\t ");

            //int tid= Integer.parseInt(request.getParameter("tid"));
             ExaminationDAO d1=new ExaminationDAO(ConnectionProvider.getConnection());
             ArrayList<Question> arr=d1.getQuestions(9);
             int i=0;
             for(Question a:arr){
         
      out.write("\n");
      out.write("\t<div class=\"card\">\n");
      out.write("            <div class=\"card-body card-text\">Q(");
      out.print(i);
      out.write(").<h4 class=\"card-header\">");
      out.print(a.getQue());
      out.write("</h4></div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("          <div class=\"card-body\">\n");
      out.write("              <input type=\"radio\" name=\"quizecheck[");
      out.print(i);
      out.write("]\" value=\"");
      out.print(a.getCh1() );
      out.write('"');
      out.write('>');
      out.print(a.getCh1() );
      out.write("<br>\n");
      out.write("               <input type=\"radio\" name=\"quizecheck[");
      out.print(i);
      out.write("]\" value=\"");
      out.print(a.getCh2() );
      out.write('"');
      out.write('>');
      out.print(a.getCh2() );
      out.write("<br>\n");
      out.write("               <input type=\"radio\" name=\"quizecheck[");
      out.print(i);
      out.write("]\" value=\"");
      out.print(a.getCh3() );
      out.write('"');
      out.write('>');
      out.print(a.getCh3() );
      out.write("<br>\n");
      out.write("               <input type=\"radio\" name=\"quizecheck[");
      out.print(i);
      out.write("]\" value=\"");
      out.print(a.getCh4() );
      out.write('"');
      out.write('>');
      out.print(a.getCh4() );
      out.write("<br>\n");
      out.write("              \n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        ");

        i++;
             }
          
      out.write("\n");
      out.write("\t<input type=\"submit\" name=\"submit\" value=\"submit\">\n");
      out.write("\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<a href=\"login.php\" class=\"btn btn-primary\" class=\"btn btn-success\" m-auto d-block>LOGOUT</a>\n");
      out.write(" \n");
      out.write(" <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\n");
      out.write("<script src=\"js/materialize.js\"></script>\n");
      out.write("         <script src=\"js/init.js\"></script>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"./bo/css/bootstrap.js\"></script>\n");
      out.write("        <script src=\"./bo/css/bootstrap.bundle.js\"></script>\n");
      out.write("        <script src=\"./bo/css/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"./bo/css/bootstrap.bundle.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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

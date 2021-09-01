package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AboutUs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Normal_nav.html");
  }

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
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/materialize.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/materialize.min.css\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--META-->\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"./bo/css/bootstrap.min.css\" >\n");
      out.write("        <!--FONTS-->\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Raleway:900,300,700' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css\">\n");
      out.write("        <!--CSS External-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/home.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://fonts.googleapis.com/css?family=Rancho&effect=shadow-multiple\">\n");
      out.write("        <!--rohit css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/hj.css\" >\n");
      out.write("        <!--yash created-->\n");
      out.write("        <link rel=\"stylesheet\" href=./css/Css.css>\n");
      out.write("        <script src=\"./js/valid.js\"></script>\n");
      out.write("         ");
      out.write("<html> \r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <title>CET</title>\r\n");
      out.write("    <!-- Compiled and minified CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/materialize.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/materialize.min.css\">\r\n");
      out.write("\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--META-->\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" >-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"./bo/css/bootstrap.min.css\" >\r\n");
      out.write("\r\n");
      out.write("    <!--FONTS-->\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Raleway:900,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css\">\r\n");
      out.write("    <!--CSS External-->\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/home.css\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("          href=\"https://fonts.googleapis.com/css?family=Rancho&effect=shadow-multiple\">\r\n");
      out.write("    \r\n");
      out.write("    <!--rohit css-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/hj.css\" >\r\n");
      out.write("        \r\n");
      out.write("    <!--yash created-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=./css/Css.css>\r\n");
      out.write("    <script src=\"./js/valid.js\"></script>\r\n");
      out.write("    <style>\r\n");
      out.write("        .M1 {\r\n");
      out.write("            font-family: 'Tangerine', serif;\r\n");
      out.write("            font-size: 48px;\r\n");
      out.write("        }  \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"\">\r\n");
      out.write("    <nav class=\"transparent rounded \" role=\"navigation\">\r\n");
      out.write("        <div class=\"nav-wrapper container\">\r\n");
      out.write("            <!--<i class=\"material-icons\">ac_unit</i>-->\r\n");
      out.write("            <a href=\"#\" class=\"brand-logo active font-effect-shadow-multiple\"><i><img src=\"./images/brainstorm.png\" alt=\"\" width=\"50\" height=\"50\" class=\"img-fluid d-inline-block align-items-xl-start\"></i><span><i>TestYourSkill</i></span></a>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("                <li><a href=\"index.jsp\" class=\"active\">Home</a></li>\r\n");
      out.write("                <li><a href=\"./AboutUs\">About</a></li>\r\n");
      out.write("                <li><a href=\"./ContactUs\">Contact us</a></li>\r\n");
      out.write("                <li><a href=\"./Login.jsp\">Login</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul id=\"nav-mobile\" class=\"sidenav\">\r\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                <li><a href=\"./AboutUs\">About</a></li>\r\n");
      out.write("                <li><a href=\"./ContactUs\">Contact us</a></li>\r\n");
      out.write("                <li><a href=\"./Login.jsp\">Login</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <a href=\"#\" data-target=\"nav-mobile\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!--  Scripts-->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"js/materialize.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("      <script src=\"js/init.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>About us</h1>\n");
      out.write("        <h1>we are an team of collage we made this web site for non-profitable purpose</h1>\n");
      out.write("        <pre>its just for eduction and small initiative for collabration in education </pre>\n");
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

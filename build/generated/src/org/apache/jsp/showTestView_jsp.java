package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.dao.ExaminationDAO;
import com.tech.helper.ConnectionProvider;
import java.util.ArrayList;
import com.tech.entities.Question;

public final class showTestView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write(" \n");
      out.write("        ");
 
        int id=Integer.parseInt(request.getParameter("tid"));
        String s=request.getParameter("ttitle");
        
      out.write("\n");
      out.write("        \n");
      out.write("               <div>\n");
      out.write("                    <div class=\" text-center bg-primary\">\n");
      out.write("                        <h5 class=\"modal-title text-white \" id=\"exampleModalLabel\">\n");
      out.write("                            ");
      out.print(s);
      out.write("\n");
      out.write("                        </h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"Test-Detail\" >\n");
      out.write("                        <div class=\"\">\n");
      out.write("                            <div class=\"container text-center\">\n");
      out.write("\n");
      out.write("                                <table class=\"text-primary table table-hover table-striping \">\n");
      out.write("                                    ");

                                        ExaminationDAO dao = new ExaminationDAO(ConnectionProvider.getConnection());
                                        ArrayList<Question> m2 = dao.getQuestions(id);
                                        int i=1;
                                        for (Question m1 : m2) {

                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th colspan=\"4\"><span>Q-");
      out.print(i);
      out.write("</span>");
      out.print(m1.getQue());
      out.write("</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><span><input type=\"checkbox\" name=\"ch1\">");
      out.print(m1.getCh1());
      out.write("</span></td>\n");
      out.write("                                        <td><span><input type=\"checkbox\" name=\"ch2\">");
      out.print(m1.getCh2() );
      out.write("</span></td>\n");
      out.write("                                        <td><span><input type=\"checkbox\" name=\"ch3\">");
      out.print(m1.getCh3() );
      out.write("</span></td>\n");
      out.write("                                        <td><span><input type=\"checkbox\" name=\"ch4\">");
      out.print(m1.getCh4() );
      out.write("</span></td>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    ");

                                    i++;
                                        }
                                    
      out.write("\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Add Now</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                    </div> \n");
      out.write("               </div>\n");
      out.write("         ");
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

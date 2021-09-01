package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.entities.Student;
import com.tech.dao.StudentDAO;
import com.tech.entities.ExamineeMockTest;
import java.util.HashMap;
import com.tech.entities.Result;
import java.util.ArrayList;
import com.tech.dao.ExamineeExaminationDAO;
import com.tech.helper.ConnectionProvider;

public final class EShowResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <table class=\"table table-striped table-striping\">\n");
      out.write("            <tr>\n");
      out.write("                <td>TestName :</td>\n");
      out.write("                <td>StudentName :</td>\n");
      out.write("                <td>Total Attempt :</td>\n");
      out.write("                <td>Total Score:</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                int eid = Integer.parseInt(request.getParameter("eid"));
                ExamineeExaminationDAO e = new ExamineeExaminationDAO(ConnectionProvider.getConnection());
                HashMap<Integer, HashMap<Integer, ArrayList<Result>>> hs = e.getResultbyExamineeID(eid);
                for (int i : hs.keySet()) {//Testid
                    ExamineeMockTest m = e.showTestByTid(i);
                    String TestName = m.getName();
                    StudentDAO s = new StudentDAO(ConnectionProvider.getConnection());
                    HashMap<Integer, ArrayList<Result>> ms = hs.get(i);//key=Stuid,value=result
                    for (int j : ms.keySet()) {
                        Student s1 = s.getStuByID(j);
                        ArrayList<Result> res = ms.get(j);
                        int Attempts = 0;
                        int totalScore = 0;

                        for (Result r1 : res) {
                            int tq = r1.getTotalQue();
                            int ra = r1.getRightAns();
                            if (tq == 0) {
                            } else {

                                totalScore += (((ra * 1.0) / (tq * 1.0)) * 100);
                            }
                            Attempts++;
                        }
                        if (Attempts == 0) {
                        } else {
                            totalScore = Math.round(totalScore / Attempts);
                        }


            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(TestName);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(s1.getName());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(Attempts);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(totalScore);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");

                    }
                }
            
      out.write("     \n");
      out.write("        </table>\n");
      out.write("\n");
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

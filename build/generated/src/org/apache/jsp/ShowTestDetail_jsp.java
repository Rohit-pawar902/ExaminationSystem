package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tech.entities.Question;
import java.util.ArrayList;
import com.tech.entities.MockTest;
import com.tech.dao.ExaminationDAO;
import com.tech.helper.ConnectionProvider;

public final class ShowTestDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/hj.css\" >\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ExaminationDAO dao = new ExaminationDAO(ConnectionProvider.getConnection());
            ArrayList<MockTest> m = dao.showAllTest();
            for (MockTest m1 : m) {
        
      out.write("\n");
      out.write("        <div class=\"card bg-white shadow-lg rounded\">\n");
      out.write("            <div class=\"card-header shadow-lg rounded bg-primary text-center text-white \">");
      out.print(m1.getTitle());
      out.write("<span class=\"invisible\"><input type=\"number\"  value=\"");
      out.print(m1.getId());
      out.write("\"></span></div>\n");
      out.write("            <div class=\"card-body shadow-lg rounded \">");
      out.print(m1.getDesc());
      out.write("</div>\n");
      out.write("            <div class=\"card-footer shadow-lg rounded \">\n");
      out.write("                <a class=\"card-link btn-sm btn-link bg-info btn-info btn-outline-danger btn-info text-justify m-1\" id=\"get-id\" onclick=\"setId(");
      out.print(m1.getId());
      out.write(")\" data-toggle=\"modal\" data-target=\"#pos-modal\">add Question</a>\n");
      out.write("                <a class=\"card-link btn-sm btn-link bg-info btn-outline-danger btn-info text-justify m-1\" data-toggle=\"modal\" data-target=\"#view-test\" id=\"get-view\" onclick='setView(");
      out.print(m1.getId());
      out.write(", \"");
      out.print(m1.getTitle());
      out.write("\")'  >View Test</a>\n");
      out.write("                <a class=\"card-link btn-sm btn-link bg-info btn-outline-danger btn-info text-justify m-1\" onclick='deleteView(");
      out.print(m1.getId());
      out.write(", this)'  >Delete Test</a>\n");
      out.write("                <a class=\"card-link btn-sm btn-link bg-info btn-outline-danger btn-info text-justify m-1\" data-toggle=\"modal\" data-target=\"#view-test\" id=\"get-view\" onclick='updateView(");
      out.print(m1.getId());
      out.write(", this)'  >Update Test</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>    \n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"pos-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"example1\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header text-center bg-primary\">\n");
      out.write("                        <h5 class=\"modal-titleb \" id=\"example1\">Create Test</h5>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <form  id=\"post-question\" method=\"post\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Question</label>\n");
      out.write("                                    <input type=\"\" name=\"question\" id=\"course_name\" class=\"form-control\" placeholder=\"Input question\" autocomplete=\"off\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <fieldset>\n");
      out.write("                                    <legend>Input word for choice's</legend>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Choice A</label>\n");
      out.write("                                        <input type=\"\" name=\"choice_A\" id=\"choice_A\" class=\"form-control\" placeholder=\"Input choice A\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Choice B</label>\n");
      out.write("                                        <input type=\"\" name=\"choice_B\" id=\"choice_B\" class=\"form-control\" placeholder=\"Input choice B\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Choice C</label>\n");
      out.write("                                        <input type=\"\" name=\"choice_C\" id=\"choice_C\" class=\"form-control\" placeholder=\"Input choice C\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Choice D</label>\n");
      out.write("                                        <input type=\"\" name=\"choice_D\" id=\"choice_D\" class=\"form-control\" placeholder=\"Input choice D\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Correct Answer</label>\n");
      out.write("                                        <input type=\"\" name=\"correctAnswer\" id=\"\" class=\"form-control\" placeholder=\"Input correct answer\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("                                </fieldset>\n");
      out.write("\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\">Add Now</button>\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal fade\" id=\"view-test\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"example2\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div  id=\"kl\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            function deleteView(a, b) {\n");
      out.write("//                $(b).parent().parent().remove();\n");
      out.write("                c = 1;\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"/TestYourSkill//DelUpdTestServ\",\n");
      out.write("                    data: {tid: a, oper: c},\n");
      out.write("                    success: function(data) {\n");
      out.write("                        console.log(data);\n");
      out.write("                        if (data.toString().localeCompare(\"done\") == 0) {\n");
      out.write("                            swal({\n");
      out.write("                                title: \"done!\",\n");
      out.write("                                text: \"Changes performed\",\n");
      out.write("                                icon: \"success\"\n");
      out.write("                            });\n");
      out.write("                            $(b).parent().parent().remove();\n");
      out.write("                        }\n");
      out.write("                        else {\n");
      out.write("                            swal({\n");
      out.write("                                title: \"error!\",\n");
      out.write("                                text: \"Changes not performed\",\n");
      out.write("                                icon: \"warning\"\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function(data) {\n");
      out.write("                        console.log(data);\n");
      out.write("                        swal({\n");
      out.write("                            title: \"error!\",\n");
      out.write("                            text: \"Changes not performed\",\n");
      out.write("                            icon: \"warning\"\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("            function updateView(a, b) {\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"DelUpdTestServ\",\n");
      out.write("                    data: {tid: a, type: 2},\n");
      out.write("                    success: function(data) {\n");
      out.write("                        console.log(data);\n");
      out.write("                        if (data.toString().localeCompare(\"done\") == 0) {\n");
      out.write("                            swal({\n");
      out.write("                                title: \"done!\",\n");
      out.write("                                text: \"Changes performed\",\n");
      out.write("                                icon: \"success\"\n");
      out.write("                            });\n");
      out.write("                            $(b).parent().parent().remove();\n");
      out.write("                        }\n");
      out.write("                        else {\n");
      out.write("                            swal({\n");
      out.write("                                title: \"error!\",\n");
      out.write("                                text: \"Changes not performed\",\n");
      out.write("                                icon: \"warning\"\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("                    },\n");
      out.write("                    error: function(data) {\n");
      out.write("                        console.log(data);\n");
      out.write("                        swal({\n");
      out.write("                            title: \"error!\",\n");
      out.write("                            text: \"Changes not performed\",\n");
      out.write("                            icon: \"warning\"\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var id = 0;\n");
      out.write("            function setId(a) {\n");
      out.write("                id = a;\n");
      out.write("                console.log(a);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("\n");
      out.write("                $(\"#post-question\").on(\"submit\", function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    console.log(\"hii\");\n");
      out.write("                    console.log(id);\n");
      out.write("                    let form = new FormData(this);\n");
      out.write("                    form.append(\"tid\", id);\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"/TestYourSkill//AddQuestionServ\",\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        data: form,\n");
      out.write("                        success: function(data, textStatus, jqXHR) {\n");
      out.write("                            console.log(\"question succefully added\");\n");
      out.write("                            swal({\n");
      out.write("                                title: \"done!\",\n");
      out.write("                                text: \"question succefully added\",\n");
      out.write("                                icon: \"success\"\n");
      out.write("                            });\n");
      out.write("                            $('#post-question').trigger(\"reset\");\n");
      out.write("                        },\n");
      out.write("                        error: function(data, textStatus, jqXHR) {\n");
      out.write("                            console.log(data);\n");
      out.write("                            swal({\n");
      out.write("                                title: \"done!\",\n");
      out.write("                                text: \"Technical error\",\n");
      out.write("                                icon: \"warning\"\n");
      out.write("                            });\n");
      out.write("                            console.log(\"question succefully not added\");\n");
      out.write("                            $('#post-question').trigger(\"reset\");\n");
      out.write("                        },\n");
      out.write("                        processData: false,\n");
      out.write("                        contentType: false\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function setView(a, b) {\n");
      out.write("\n");
      out.write("                console.log(\"ghjhj\");\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"showTestView.jsp\",\n");
      out.write("                    data: {tid: a, ttitle: b},\n");
      out.write("                    success: function(data, textStatus, jqXHR) {\n");
      out.write("                        console.log(\"question added\");\n");
      out.write("                        swal({\n");
      out.write("                            title: \"done!\",\n");
      out.write("                            text: \"Technical\",\n");
      out.write("                            icon: \"success\"\n");
      out.write("                        });\n");
      out.write("                        console.log(data);\n");
      out.write("                        $(\"#kl\").html(data);\n");
      out.write("                    },\n");
      out.write("                    error: function(data, textStatus, jqXHR) {\n");
      out.write("                        console.log(data);\n");
      out.write("                        swal({\n");
      out.write("                            title: \"done!\",\n");
      out.write("                            text: \"Technical error\",\n");
      out.write("                            icon: \"warning\"\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
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

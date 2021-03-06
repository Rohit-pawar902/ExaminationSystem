package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.tech.entities.MockTest;
import com.tech.dao.ExaminationDAO;
import com.tech.helper.ConnectionProvider;
import com.tech.entities.Student;
import com.tech.entities.Examinee;
import com.tech.entities.Admin;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/AdminNav.html");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
    Student n = (Student) session.getAttribute("currentUser");
    if (n != null) {

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .card-body{\n");
      out.write("                background-image: linear-gradient(white);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("        <title>CET</title>\r\n");
      out.write("        <!-- Compiled and minified CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/materialize.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/materialize.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--META-->\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" >-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./bo/css/bootstrap.min.css\" >\r\n");
      out.write("\r\n");
      out.write("        <!--FONTS-->\r\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Raleway:900,300,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.2/css/font-awesome.min.css\">\r\n");
      out.write("        <!--CSS External-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/home.css\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\"\r\n");
      out.write("              href=\"https://fonts.googleapis.com/css?family=Rancho&effect=shadow-multiple\">\r\n");
      out.write("        <!--rohit css-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/hj.css\" >\r\n");
      out.write("        <!--yash created-->\r\n");
      out.write("        <link rel=\"stylesheet\" href=./css/Css.css>\r\n");
      out.write("        <script src=\"./js/valid.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            .M1 {\r\n");
      out.write("                font-family: 'Tangerine', serif;\r\n");
      out.write("                font-size: 48px;\r\n");
      out.write("            }  \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"\">\r\n");
      out.write("        <nav class=\"transparent rounded\" role=\"navigation\">\r\n");
      out.write("            <div class=\"nav-wrapper container\">\r\n");
      out.write("                <!--<i class=\"material-icons\">ac_unit</i>-->\r\n");
      out.write("                <a href=\"index.jsp\" class=\"brand-logo active font-effect-shadow-multiple\"><i><img src=\"./images/brainstorm.png\" alt=\"\" width=\"50\" height=\"50\" class=\"img-fluid d-inline-block align-items-xl-start\"></i><span><i>TestYourSkill</i></span></a>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("                    <li class=\"text-warning\">\r\n");
      out.write("                        <div class=\"\">\r\n");
      out.write("                            <span class=\"fa fa-user fa-spin ml-1 pl-1\"></span>\r\n");
      out.write("                            <a class=\"btn mx-3 px-1\" href=\"!#\" data-toggle=\"modal\" data-target=\"#profile-modal\"><div class=\"media align-items-center\">\r\n");
      out.write("                                    <span class=\"rounded-circle\">\r\n");
      out.write("                                        <img alt=\"Image placeholder\" src=\"./images/");
      out.print(n.getProfile());
      out.write("\"  width=\"20\" height=\"20\">\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <div class=\"media-body  ml-2  d-none d-lg-block\">\r\n");
      out.write("                                        <span class=\"mb-0 text-sm  font-weight-bold\">");
      out.print(n.getName());
      out.write("</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal fade\" id=\"profile-modal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                                <div class=\"modal-content\">\r\n");
      out.write("                                    <div class=\"modal-header text-center bg-primary\">\r\n");
      out.write("                                        <h5 class=\"modal-title text-white \" id=\"exampleModalLabel\">");

                                            if (n != null) {//Dynamically writes User type
                                            if(n.getClass().getName().equals("com.tech.entities.Examinee")){
                                            out.println("Examinee profile");
                                            session.setAttribute("user","Examinee");
                                            }
                                            else if(n.getClass().getName().equals("com.tech.entities.Student")){
                                            out.println("Student profile");
                                            session.setAttribute("user","Student");
                                            }
                                            else if(n.getClass().getName().equals("com.tech.entities.Admin")){
                                            out.println("Admin profile");
                                            session.setAttribute("user","Admin");
                                            }
                                            }
                                            
      out.write("</h5>\r\n");
      out.write("                                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                                            <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"Profile-Detail\" >\r\n");
      out.write("                                        <div class=\"modal-body\">\r\n");
      out.write("                                            <div class=\"container text-center\">\r\n");
      out.write("\r\n");
      out.write("                                                <img src=\"./images/");
      out.print(n.getProfile());
      out.write("\" alt=\"\" class=\"img-fluid \" width=\"100\" height=\"100\">\r\n");
      out.write("\r\n");
      out.write("                                                <h1 class=\"text-capitalize \">");
      out.print(n.getName());
      out.write("</h1>\r\n");
      out.write("\r\n");
      out.write("                                                <table class=\"text-primary table table-hover table-striping \">\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>User ID:</th>\r\n");
      out.write("                                                        <td>");
      out.print(n.getId());
      out.write("</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>Email Id:</th>\r\n");
      out.write("                                                        <td>");
      out.print(n.getEmail());
      out.write("</td> \r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>Gender :</th>\r\n");
      out.write("                                                        <td>");
      out.print(n.getGender());
      out.write("</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>Mobile :</th>\r\n");
      out.write("                                                        <td>");
      out.print(n.getMobile());
      out.write("</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>Education Field:</th>\r\n");
      out.write("                                                        <td>");
      out.print(n.getField());
      out.write("</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                    <tr>\r\n");
      out.write("                                                        <th>Registration Date :</th>\r\n");
      out.write("                                                        <td>");
      out.print(n.getRdate());
      out.write("</td>\r\n");
      out.write("                                                    </tr>\r\n");
      out.write("                                                </table>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>  \r\n");
      out.write("\r\n");
      out.write("                                    <!--profile-Edit-->\r\n");
      out.write("                                    <div id=\"Profile-Edit\" style=\"display:none\">\r\n");
      out.write("                                        <div class=\"text-center\">\r\n");
      out.write("                                            <img src=\"./images/");
      out.print(n.getProfile());
      out.write("\" alt=\"\" class=\"img-fluid \" width=\"100\" height=\"100\">\r\n");
      out.write("                                            <h1 class=\"text-muted text-capitalize lead\">");
      out.print(n.getName());
      out.write("</h1>\r\n");
      out.write("                                            <h1 class=\"text-center text-capitalize display-6\">Edit Profile Carefully</h1>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                        <form  method=\"post\" id=\"edit\" action=\"EditServ\" class=\"form-group\"  enctype=\"multipart/form-data\" >\r\n");
      out.write("                                            <table class=\"text-primary table table-hover table-striping \">\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>User ID:</th>\r\n");
      out.write("                                                    <td><input type=\"text\" class=\"form-control\" value=\"");
      out.print(n.getId());
      out.write("\" name=\"uId\" readonly=\"true\" ></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>User Name::</th>\r\n");
      out.write("                                                    <td><input type=\"text\" class=\"form-control\" value=\"");
      out.print(n.getName());
      out.write("\" name=\"uUser\" ></td> \r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Email Id:</th>\r\n");
      out.write("                                                    <td><input type=\"Email\" class=\"form-control\" value=\"");
      out.print(n.getEmail());
      out.write("\" name=\"uEmail\" ></td> \r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Mobile:</th>\r\n");
      out.write("                                                    <td><input type=\"tel\" class=\"form-control\" value=\"");
      out.print(n.getMobile());
      out.write("\" name=\"uMob\" ></td> \r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Password :</th>\r\n");
      out.write("                                                    <td><input type=\"Password\" class=\"form-control\" value=\"");
      out.print(n.getPassword());
      out.write("\" name=\"uPass\" ></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>Gender :</th>\r\n");
      out.write("                                                    <td><input type=\"gender\" class=\"form-control\" value=\" ");
      out.print(n.getGender());
      out.write("\" name=\"uGender\" readonly=\"true\" ></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("                                                <tr>\r\n");
      out.write("                                                    <th>profile :</th>\r\n");
      out.write("                                                    <td><input type=\"file\" class=\"form-control\" value=\"");
      out.print(n.getProfile());
      out.write("\" name=\"image\" ></td>\r\n");
      out.write("                                                </tr>\r\n");
      out.write("\r\n");
      out.write("                                            </table> \r\n");
      out.write("                                            <div class=\"container text-center text-capitalize\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-outline-success\">save</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"modal-footer\">\r\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-secondary\" id=\"e-close\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\" data-toggle=\"modal\" id=\"Profile-Edit-Button\" data-target=\"#Profile-Edit\" >EDIT</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"right hide-on-med-and-down\">\r\n");
      out.write("                    <li><a href=\"index.jsp\" class=\"active\">Home</a></li>                                                                                                                                                                                                       \r\n");
      out.write("                    <li><a href=\"LogoutServ\">Logout</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("                <ul id=\"nav-mobile\" class=\"sidenav\">\r\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"LogoutServ\">Logout</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <a href=\"#\" data-target=\"#nav-mobile\" class=\"sidenav-trigger\"><i class=\"material-icons\">menu</i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("         \r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("        <!--  Scripts-->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/materialize.js\"></script>\r\n");
      out.write("         <script src=\"js/init.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"./bo/css/bootstrap.js\"></script>\r\n");
      out.write("        <script src=\"./bo/css/bootstrap.bundle.js\"></script>\r\n");
      out.write("        <script src=\"./bo/css/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"./bo/css/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                    $(document).ready(function() {\r\n");
      out.write("            let profileStatus = false;\r\n");
      out.write("                    $('#Profile-Edit-Button').click(function() {\r\n");
      out.write("            if (profileStatus == false) {\r\n");
      out.write("            $(\"#Profile-Detail\").hide();\r\n");
      out.write("                    $(\"#Profile-Edit\").show();\r\n");
      out.write("                    $(\"#e-close\").hide();\r\n");
      out.write("                    profileStatus = true;\r\n");
      out.write("                    $(this).text(\"BACK\");\r\n");
      out.write("            }\r\n");
      out.write("            else {\r\n");
      out.write("            $(\"#Profile-Detail\").show();\r\n");
      out.write("                    $(\"#Profile-Edit\").hide();\r\n");
      out.write("                    $(\"#e-close\").show();\r\n");
      out.write("                    profileStatus = false;\r\n");
      out.write("                    $(this).text(\"EDIT\");\r\n");
      out.write("            }\r\n");
      out.write("            });\r\n");
      out.write("            });</script>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("                    $(document).ready(function(){\r\n");
      out.write("            $(\"#edit\").submit(function(e){\r\n");
      out.write("            e.preventDefault();\r\n");
      out.write("                    let form = new FormData(this);\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                    url:\"EditServ\",\r\n");
      out.write("                            type:\"post\",\r\n");
      out.write("                            data:form,\r\n");
      out.write("                            success:function(data, status, jqXHR){\r\n");
      out.write("                            swal({\r\n");
      out.write("                            title:\"done\",\r\n");
      out.write("                                    text:\"Profile updated succesfully\",\r\n");
      out.write("                                    icon:\"success\"\r\n");
      out.write("                            });\r\n");
      out.write("                                    console.log(data);\r\n");
      out.write("                            },\r\n");
      out.write("                            error:function(){\r\n");
      out.write("                            swal({\r\n");
      out.write("                            title:\"Error!\",\r\n");
      out.write("                                    text:\"Profile not updated\",\r\n");
      out.write("                                    icon:\"Warning\"\r\n");
      out.write("                            });\r\n");
      out.write("                                    console.log(data);\r\n");
      out.write("                            },\r\n");
      out.write("                            processData: false,\r\n");
      out.write("                            contentType: false\r\n");
      out.write("                    });\r\n");
      out.write("            });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("        <h1 class=\"text-center\">Hello ");
      out.print(n.getName());
      out.write("</h1>\n");
      out.write("        <span id=\"1st\"><i class=\"fa fa-gear fa-spin ml-1 pl-1\"  style=\"font-size:48px;color:white;\"></i></span> \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 \" id=\"bar\">\n");
      out.write("                    <div class=\"list-group w-100\" value=\"0\" id=\"catagorie-list\">\n");
      out.write("                        <div class=\"list-group-item list \"><button class=\"btn btn-warning w-100\" id=\"c-test\">Free Tests</button> </div>\n");
      out.write("                        <div class=\"list-group-item list \"><button class=\"btn btn-warning w-100\" id=\"e-test\">Examinee Tests</button> </div>\n");
      out.write("                        <div class=\"list-group-item list \"><button class=\"btn btn-warning w-100\" id=\"s-result\">Results</button> </div>\n");
      out.write("\n");
      out.write("                        <div class=\"list-group-item list \"><button class=\"btn btn-warning w-100\" id=\"load-test\">Loaded Tests</button> </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"container-fluid\" id=\"ctest\">\n");
      out.write("\n");
      out.write("                        <div class=\"d-flex flex-wrap\" >\n");
      out.write("\n");
      out.write("                            ");

                                ExaminationDAO dao = new ExaminationDAO(ConnectionProvider.getConnection());
                                ArrayList<MockTest> m = dao.showAllTest();
                                for (int i = 0; i < m.size() - 1; i++) {
                                    MockTest m1 = m.get(i);

                            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--<div class=\"\">--> \n");
      out.write("\n");
      out.write("                            <div class=\"card m-5\" style=\" width:200px;height:250px\">\n");
      out.write("                                <div class=\"card-header shadow-lg rounded  text-center text-primary \">");
      out.print(m1.getTitle());
      out.write("</div>\n");
      out.write("                                <div class=\"card-body shadow-lg rounded \">\n");
      out.write("                                    <div class=\"card-text \">");
      out.print(m1.getDesc());
      out.write("</div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer shadow-lg rounded text-center \">\n");
      out.write("                                    <a class=\"card-link  btn btn-link btn-outline-danger  text-center\" id=\"get-id\" onclick=\"loadTest(");
      out.print(m1.getId());
      out.write(")\" data-toggle=\"modal\" data-target=\"#pos-modal\">Start Test</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"container\" id=\"etest\">\n");
      out.write("                        <div class=\"card rounded-circle w-100 p-4\">\n");
      out.write("                            <div class=\"card-header text-center\">\n");
      out.write("                                <h1 class=\"lead text-center text-primary\">Private Test Login</h1>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <form id=\"e-login\" method=\"post\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Examinee name:</label>\n");
      out.write("                                        <input type=\"text\" name=\"Ename\" placeholder=\"Enter Name of Examinee\" class=\"form-control\" required=\"true\"> \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label>Password:</label>\n");
      out.write("                                        <input type=\"Password\" name=\"Epass\" placeholder=\"Enter Password\" class=\"form-control\" required=\"true\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input id=\"e-submit\" type=\"submit\" value=\"submit\" class=\" btn btn-primary form-control\">\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container\" id=\"loadtest\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#bar\").hide();\n");
      out.write("                $(\"#1st\").on(\"click\", function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    console.log(\"click\");\n");
      out.write("                    $(\"#bar\").toggle();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#ctest\").hide();\n");
      out.write("                $(\"#etest\").hide();\n");
      out.write("                $(\"#load-test\").hide();\n");
      out.write("                $(\"#c-test\").on(\"click\", function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    $(\"#etest\").hide();\n");
      out.write("                    $(\"#loadtest\").hide();\n");
      out.write("                    $(\"#ctest\").toggle();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#e-test\").on(\"click\", function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    $(\"#ctest\").hide();\n");
      out.write("                    $(\"#loadtest\").hide();\n");
      out.write("                    $(\"#etest\").toggle();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#load-test\").on(\"click\", function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    $(\"#ctest\").hide();\n");
      out.write("                    $(\"#etest\").hide();\n");
      out.write("                    $(\"#loadtest\").toggle();\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $(\"#s-result\").on(\"click\", function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    console.log(\"click2\");\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"GetStuResult.jsp\",\n");
      out.write("                        type:\"POST\"\n");
      out.write("                        success: function(data, textStatus, jqXHR) {\n");
      out.write("                            console.log(\"Success\");\n");
      out.write("                            console.log(data);\n");
      out.write("\n");
      out.write("                        },\n");
      out.write("                        error: function(data, textStatus, jqXHR) {\n");
      out.write("                            console.log(\"error\");\n");
      out.write("                            console.log(data);\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            $(document).ready(function() {\n");
      out.write("\n");
      out.write("                $(\"#e-login\").on(\"submit\", function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    $(\"#e-submit\").hide();\n");
      out.write("                    let form = new FormData(this);\n");
      out.write("                    f1 = form.get(\"Ename\");\n");
      out.write("                    f = form.get(\"Epass\");\n");
      out.write("                    console.log(f + f1);\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: \"StuExamineeSubmitServ\",\n");
      out.write("                        type: \"POST\",\n");
      out.write("                        data: {Ename: f1, Epass: f},\n");
      out.write("                        success: function(data, textStatus, jqXHR) {\n");
      out.write("                            console.log(data);\n");
      out.write("                            if (data === 0) {\n");
      out.write("                                alert(\"wrong information\");\n");
      out.write("                            }\n");
      out.write("                            else {\n");
      out.write("                                fun(data);\n");
      out.write("                            }\n");
      out.write("                            $(\"#e-submit\").show();\n");
      out.write("\n");
      out.write("                        },\n");
      out.write("                        error: function(data, textStatus, jqXHR) {\n");
      out.write("                            console.log(data);\n");
      out.write("                            $(\"#e-submit\").show();\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function fun(d) {\n");
      out.write("                console.log(d);\n");
      out.write("                $.ajax({\n");
      out.write("                    url: \"SETestShow.jsp\",\n");
      out.write("                    data: {eid: d},\n");
      out.write("                    success: function(data, textStatus, jqXHR) {\n");
      out.write("                        console.log(data);\n");
      out.write("                        $(\"#etest\").hide();\n");
      out.write("                        $(\"#loadtest\").html(data);\n");
      out.write("                        $(\"#load-test\").show();\n");
      out.write("                        $(\"#loadtest\").show();\n");
      out.write("\n");
      out.write("                    },\n");
      out.write("                    error: function(data, textStatus, jqXHR) {\n");
      out.write("                        console.log(data);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function loadTest(b) {\n");
      out.write("                console.log(b);\n");
      out.write("//               replace\n");
      out.write("//               window.location.href=\"StuTestPage.jsp\";     \n");
      out.write("                window.location.href = \"StuTestPage.jsp?tid=\" + b + \"\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function setId(b) {\n");
      out.write("                console.log(b);\n");
      out.write("//               replace\n");
      out.write("//               window.location.href=\"StuTestPage.jsp\";     \n");
      out.write("                window.location.href = \"StuETestPage.jsp?tid=\" + b + \"\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");

    }

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

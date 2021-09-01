<%-- 
    Document   : SETestShow
    Created on : 28 Apr, 2021, 2:27:22 PM
    Author     : DELL
--%>

<%@page import="com.tech.entities.ExamineeMockTest"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.dao.ExamineeExaminationDAO"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div>
            <div class="row" >
                <%
                    int eid = Integer.parseInt(request.getParameter("eid"));
                    ExamineeExaminationDAO dao = new ExamineeExaminationDAO(ConnectionProvider.getConnection());
                    ArrayList<ExamineeMockTest> m = dao.showAllTest(eid);
                    for (int i = 0; i < m.size(); i++) {
                        ExamineeMockTest m1 = m.get(i);
                        
                %>


                

                    <div class="card shadow-lg  w-100 h-100 rounded">
                        <div class="card-header shadow-lg rounded  text-center text-primary "><%=m1.getName()%></div>
                        <div class="card-body shadow-lg rounded ">
                            <div class="card-text "><%=m1.getDescription()%></div>
                        </div>
                        <div class="card-footer shadow-lg rounded text-center ">
                            <a class="card-link  btn btn-link btn-outline-danger  text-center" id="get-id" onclick="setId(<%=m1.getEtid()%>)" data-toggle="modal" data-target="#pos-modal">Start Test</a>
                        </div>
                    </div>
                </div>
                        
                 

                <%
                        }
                %>
            </div>
        
        <div>
            <a class="btn btn-info text-center" id="backToE">Logout</a>
        </div>
         <script>
            $(document).ready(function() {
                $("#backToE").on("click", function(e) {
                    e.preventDefault();
                    console.log("hii");
                    $("#loadtest").html('<h1 class="lead text-center">Logout successfully</h1>');
                   
                });
            });
            
            function loadTest(b){
               console.log(b);
//               replace
//               window.location.href="StuTestPage.jsp";     
             window.location.href="StuETestPage.jsp?tid="+b+"";
           }
        </script>


    </body>
</html>

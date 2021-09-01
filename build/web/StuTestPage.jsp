<%-- 
    Document   : StuTestPage
    Created on : 29 Apr, 2021, 8:30:28 PM
    Author     : DELL
--%>

<%@page import="com.tech.entities.MockTest"%>
<%@page import="com.tech.entities.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.entities.Question"%>
<%@page import="com.tech.dao.ExaminationDAO"%>
<%@page import="com.tech.dao.ExamineeExaminationDAO"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Student n = (Student) session.getAttribute("currentUser");
    if (n != null) {
         int tid= Integer.parseInt(request.getParameter("tid"));
                    session.setAttribute("testID",tid);
                      ExaminationDAO d1 = new ExaminationDAO(ConnectionProvider.getConnection());
                    MockTest m=  d1.showTestByTid(tid);
      
                        session.setAttribute("test","Admin");
                       
      
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Ds</title>
        <link rel="stylesheet" href="./bo/css/bootstrap.min.css" >
        <link rel="stylesheet" href="./css/hj.css" >
        <!--yash created-->
        <!--<link rel="stylesheet" href=./css/Css.css>-->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    </head>
    <body>
        <div class="container">
            <br>
            <div class="card card-header">
                <u style="color:yellow"><h1 class="text-color text-primary" align="center"> <%=m.getTitle() %> </h1></u>
            </div>
            <br>
            <div style="color: black"> 
                <hr>
            </div>
            <h2 style="color: yellow" class=" text-primary"> welcome<%=n.getName()%> have a great test</h2>
            <br>
        </div >
        <div class="col-lg-8 m-auto d-block">

            <div class="card">
                <h3 class="text-center card-header">Welcome user you have mandatory to attempt every que</h3>
            </div>
            <br>
            <form method="post" action="Check.jsp">

                <% 
                    ArrayList<Question> arr = d1.getQuestions(tid);
                    int i = 1;
                %>
                <input type="text" id="tq" name="totalQue" value="<%=arr.size()%>">
                <%
                    for (Question a : arr) {
                %>
                <div class="card">
                    <div class="card-body card-text">Q(<%=i%>).<h4 class="card-header"><%=a.getQue()%></h4></div>


                    <div class="card-body">
                        <div class="form-group">
                            <input   type="radio" name="quizecheck[<%=i%>]" value="<%=a.getCh1()%>"><%=a.getCh1()%><br>
                            <input   type="radio" name="quizecheck[<%=i%>]" value="<%=a.getCh2()%>"><%=a.getCh2()%><br>
                            <input   type="radio" name="quizecheck[<%=i%>]" value="<%=a.getCh3()%>"><%=a.getCh3()%><br>
                            <input   type="radio" name="quizecheck[<%=i%>]" value="<%=a.getCh4()%>"><%=a.getCh4()%><br>
                            <input   type="text" class="ans" name="anscheck[<%=i%>]" value="<%=a.getAns()%>">
                        </div>
                    </div>

                    <%
                            i++;
                        }
                    %>
                    <div class="form-group">
                        <input class="form-control" type="submit" name="submit" value="submit">
                    </div>
                </div>
            </form>            
        </div>
        <a href="login.php" class="btn btn-primary" class="btn btn-success" m-auto d-block>LOGOUT</a>

        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script>
        <script src="js/jquery.min.js"></script>
        <script src="./bo/css/bootstrap.js"></script>
        <script src="./bo/css/bootstrap.bundle.js"></script>
        <script src="./bo/css/bootstrap.min.js"></script>
        <script src="./bo/css/bootstrap.bundle.min.js"></script>
        <script>
            $(document).ready(function(e) {
                $("#tq").hide();
                $(".ans").hide();
            });
        </script>
    </body>
</html>
<%
    }
%>
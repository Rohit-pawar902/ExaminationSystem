<%-- 
    Document   : Check
    Created on : 29 Apr, 2021, 11:08:02 PM
    Author     : DELL
--%>

<%@page import="com.tech.dao.ExamineeExaminationDAO"%>
<%@page import="com.tech.dao.ExaminationDAO"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page import="com.tech.entities.Result"%>
<%@page import="com.tech.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Student n = (Student) session.getAttribute("currentUser");
    if (n != null) {
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./bo/css/bootstrap.min.css" >
        <link rel="stylesheet" href="./css/hj.css" >
        <!--yash created-->
        <!--<link rel="stylesheet" href=./css/Css.css>-->
    </head>
    <body><%
        int tQue = Integer.parseInt(request.getParameter("totalQue"));
        String subAns[] = new String[tQue + 1];
        int attemptedQue = 0;
        for (int i = 1; i <= tQue; i++) {
            subAns[i] = request.getParameter("quizecheck[" + i + "]");
            if (subAns[i] != null) {
                attemptedQue++;
                subAns[i] = subAns[i].trim();

            }
        }
        String ans[] = new String[tQue + 1];
        for (int i = 1; i <= tQue; i++) {
            ans[i] = request.getParameter("anscheck[" + i + "]").trim();
        }
        int ansCount = 0;
        int wrongAns = 0;
        for (int j = 1; j < subAns.length; j++) {
            if (subAns[j] != null) {
                if (subAns[j].equals(ans[j])) {
                    ansCount++;
                }
            }
        }
        wrongAns = attemptedQue - ansCount;

        Result rs = new Result();
        rs.setStuid(n.getId());
        rs.setTid((Integer) session.getAttribute("testID"));
        rs.setRightAns(ansCount);
        rs.setQuestionAttempted(attemptedQue);
        rs.setTotalQue(tQue);
        rs.setWrongAns(wrongAns);

        %>
        <div class="container offset-5 dark-shadow m-5 p-auto">
            <h1 class="text-center text-warning card card-header">RESULT</h1>
            <hr>
            <div class="container-fluid offset-3 text-white">
                <div class="m-3 p-2">
                    <div class="h1 lead  text-white d-inline">Total Number  of Question    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      :                 </div>
                    <div class="h1 lead text-white d-inline">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rs.getTotalQue()%></div><br>
                </div>
                <div class="m-3 p-2">            
                    <div class="h1 lead  text-white d-inline">Total Number Attempted  of Question     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      :                 </div>
                    <div class="h1 lead text-white d-inline">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rs.getQuestionAttempted()%></div><br>
                </div>
                <div class="m-3 p-2">
                    <div class="h1 lead  text-white d-inline">Right Answer   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      :                 </div>
                    <div class="h1 lead text-white d-inline">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rs.getRightAns()%></div>
                </div>
                <div class="m-3 p-2">
                    <div class="h1 lead  text-white d-inline">Wrong Answer   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      :                 </div>
                    <div class="h1 lead text-white d-inline">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=rs.getWrongAns()%></div>
                </div>
            </div>
        </div>
        <%
            String test = (String) session.getAttribute("test");
            if (test.equals("Admin")) {
                ExaminationDAO dao = new ExaminationDAO(ConnectionProvider.getConnection());
                boolean b = dao.saveResult(rs);
                if (b) {%>
        <script>
            console.log("done");
        </script>
        <%
                        } else {
        %>
        <script>
            console.log(" not done");
        </script>
        <%
                }
            } else {
                int eid = Integer.parseInt(request.getParameter("eid"));
                ExamineeExaminationDAO dao = new ExamineeExaminationDAO(ConnectionProvider.getConnection());
                boolean b = dao.saveResult(rs, eid);
                 if (b) {
        %>
        <script>
            console.log("done");
        </script>
        <%
                        } else {
        %>
        <script>
            console.log(" not done");
        </script>
        <%
                }
            }
        %>


    </body>
</html>
<%
    }
%>
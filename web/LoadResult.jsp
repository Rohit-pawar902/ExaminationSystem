<%-- 
    Document   : LoadResult
    Created on : 30 Apr, 2021, 8:00:23 PM
    Author     : DELL
--%>

<%@page import="com.tech.entities.MockTest"%>
<%@page import="com.tech.dao.ExaminationDAO.Pair"%>
<%@page import="com.tech.entities.Student"%>
<%@page import="com.tech.entities.Result"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.dao.ExaminationDAO"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div class="row">         
            <%
                // StudentDAO dao = new StudentDAO(ConnectionProvider.getConnection());
                ExaminationDAO dao = new ExaminationDAO(ConnectionProvider.getConnection());
                ArrayList<com.tech.dao.ExaminationDAO.Pair> arr = dao.getAllResult();
                for (Pair s1 : arr) {
                    Student r = s1.data;
                    Result s = s1.key;
                    MockTest m=dao.showTestByTid(s.getTid());
            %>

            <div class="card w-200 h-100 m-5 ">
                <div class="card-header"><%=m.getTitle()%></div>
                 <div class="card-text text-center text-muted"><%=r.getName()%></div>
                <div class="card-body table table-hover table-striped ">
                    <div class="d-flex flex-row">
                    <div class="lead text-muted ">Total Question</div>
                     <div class="lead text-muted"><%= s.getTotalQue()%></div>
                    </div>
                    <div class="progress">
                        <div class="progress-bar progress-bar-striped" role="progressbar" style="width: 100%" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                     <div class="d-flex flex-row">
                    <div class="lead text-muted ">Attempted Question</div>
                     <div class="lead text-muted"><%= s.getQuestionAttempted()%></div>
                    </div>
                    <div class="progress">
                        <div class="progress-bar progress-bar-striped bg-success" role="progressbar" style="width: 25%" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                     <div class="d-flex flex-row">
                    <div class="lead text-muted ">Right Answers</div>
                     <div class="lead text-muted"><%= s.getRightAns()%></div>
                    </div>
                    <div class="progress">
                        <div class="progress-bar progress-bar-striped bg-info" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                     <div class="d-flex flex-row">
                    <div class="lead text-muted ">Wrong Answer</div>
                     <div class="lead text-muted"><%= s.getWrongAns()%></div>
                    </div>
                    <div class="progress">
                        <div class="progress-bar progress-bar-striped bg-warning" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                     
                     
                </div> 
            </div>
            <%
                }
            %>
        </div>
    </body>
</html>

<%-- 
    Document   : GetStuResult
    Created on : 2 Jun, 2021, 9:17:17 PM
    Author     : DELL
--%>

<%@page import="com.tech.dao.ExamineeDAO"%>
<%@page import="com.tech.entities.Examinee"%>
<%@page import="com.tech.entities.ExamineeMockTest"%>
<%@page import="com.tech.entities.MockTest"%>
<%@page import="com.tech.dao.ExamineeExaminationDAO"%>
<%@page import="com.tech.entities.Student"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.tech.entities.Result"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page import="com.tech.dao.ExaminationDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="accordion">
            <div class="card">
                <div class="card-header" id="headingOne">
                    <h5 class="mb-0">
                        <button class="btn btn-link" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                            Public Test Results
                        </button>
                    </h5>
                </div>

                <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                    <div class="card-body">
                        <div class="conatiner" id="a-res">
                            <%
                                ExaminationDAO ex = new ExaminationDAO(ConnectionProvider.getConnection());
                                Student u = (Student) session.getAttribute("currentUser");
                                HashMap<Integer, ArrayList<Result>> arr = ex.getResultbyStuID(u.getId());
                            %>

                            <pre class="card">
          <table class="table table-border table-striped table-striping text-primary">
              <tr>
                  <td>Test Name</td>
                  <td>Total Attempts</td>
                  <td>Total Score</td>
              </tr>
                                    <%
                                        for (ArrayList<Result> a1 : arr.values()) {
                                            int Attempts = 0;
                                            int totalScore = 0;
                                            MockTest m1 = null;
                                            int i = 0;
                                            for (Result r1 : a1) {
                                                int tid = r1.getTid();
                                                if (i == 0) {
                                                    i = 1;
                                                    m1 = ex.showTestByTid(tid);
                                                }
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
                                    %>
                  <tr>
                  <td><%=m1.getTitle()%></td>
                  <td><%=Attempts%></td>
                  <td><%=totalScore%>%</td>
                  
                  </tr>
                                    <%}%>
                </table>
                            </pre>
                        </div>
                    </div>
                </div>
            </div>
            <div class="card">
                <div class="card-header" id="headingTwo">
                    <h5 class="mb-0">
                        <button class="btn btn-link collapsed" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                             Examinee Tests Results
                        </button>
                    </h5>
                </div>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                    <div class="card-body">
                        <div class="conatiner" id="e-res">
                            <%
                                ExamineeExaminationDAO ex1 = new ExamineeExaminationDAO(ConnectionProvider.getConnection());

                                HashMap<Integer, ArrayList<Result>> ar1 = ex1.getResultbyStuID(u.getId());
                            %>
                            <pre class="card">
            
          <table class="table table-border table-striped table-striping text-primary">
              <tr>
                  <td>Test Name</td>
                  <td>Examinee name</td>
                  <td>Total Attempts</td>
                  <td>Total Score</td>
              </tr>
                                    <%
                                        for (ArrayList<Result> a1 : ar1.values()) {
                                            int Attempts = 0;
                                            int totalScore = 0;
                                            ExamineeMockTest m1 = null;
                                            Examinee m2 = null;
                                            int i = 0;
                                            for (Result r1 : a1) {
                                                int tid = r1.getTid();
                                                int eid = r1.getEid();
                                                if (i == 0) {
                                                    i = 1;
                                                    ExamineeDAO ex3 = new ExamineeDAO(ConnectionProvider.getConnection());
                                                    m2 = ex3.getExamineeByID(eid);
                                                    m1 = ex1.showTestByTid(tid);
                                                }
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
                                    %>
                  <tr>
                  <td><%=m1.getName()%></td>
                  <td><%=m2.getName()%></td>
                  <td><%=Attempts%></td>
                  <td><%=totalScore%>%</td>
                  
                  </tr>
                                    <%}%>
                </table>
                            </pre>
                        </div>
                    </div>
                </div>
            </div>

        </div>
         



    </body>
</html>

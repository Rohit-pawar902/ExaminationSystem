<%-- 
    Document   : EShowResult
    Created on : 13 Jun, 2021, 5:44:47 PM
    Author     : DELL
--%>

<%@page import="com.tech.entities.Student"%>
<%@page import="com.tech.dao.StudentDAO"%>
<%@page import="com.tech.entities.ExamineeMockTest"%>

<%@page import="java.util.HashMap"%>
<%@page import="com.tech.entities.Result"%>
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
    <body >
        <table class="table rounded text-primary table-striped table-striping">
             <tr>
                 <td colspan="4" class="card-header text-center text-white h1">Result</td>
            </tr>
            <tr>
                <td>TestName :</td>
                <td>StudentName :</td>
                <td>Total Attempt :</td>
                <td>Total Score:</td>
            </tr>
            <%
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


            %>
            <tr>
                <td><%=TestName%></td>
                <td><%=s1.getName()%></td>
                <td><%=Attempts%></td>
                <td><%=totalScore%></td>
            </tr>

            <%
                    }
                }
            %>     
        </table>


    </body>
</html>

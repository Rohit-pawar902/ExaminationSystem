<%-- 
    Document   : showExamineeDetail
    Created on : 22 May, 2021, 12:33:42 PM
    Author     : DELL
--%>

 
 <%@page import="com.tech.entities.Examinee"%>
<%@page import="com.tech.dao.ExamineeDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.entities.Student"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.tech.dao.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table class=" table-borderless table-hover table-striping" cellpadding="8px">
            <tr>
                <th class="jkm text-center" colspan="8">Examinee Detail</th>
            </tr>
            <tr>
                <th class="jkm test-center h6">ID:</th>
                <th class="jkm test-center h6">Name:</th>
                <th class="jkm test-center h6">Email:</th>
                <th class="jkm test-center h6">Password:</th>
                <th class="jkm test-center h6">Gender:</th>
                <th class="jkm test-center h6">Field:</th>
                <th class="jkm test-center h6">Mobile:</th>
                <th class="jkm test-center h6">Registration Date:</th>
            </tr>
            <%
                ExamineeDAO dao = new ExamineeDAO(ConnectionProvider.getConnection());
                ArrayList<Examinee> arr = dao.showDetail();
                for (Examinee s : arr) {
            %>

            <tr class="h6 info">
                <td><%=s.getId()%></td>
                <td><%= s.getName()%></td>
                <td><%= s.getEmail()%></td>
                <td><%= s.getPassword()%></td>
                <td><%= s.getGender()%></td>
                <td><%= s.getField()%></td>
                <td><%= s.getMobile()%></td>
                <td><%= s.getRdate()%></td>
            </tr>

            <%
                }
            %>
        </table>
    </body>
</html>


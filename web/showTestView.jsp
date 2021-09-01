<%-- 
    Document   : showTestView
    Created on : 24 Apr, 2021, 12:36:05 AM
    Author     : DELL
--%>

<%@page import="com.tech.dao.ExaminationDAO"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.entities.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int id = Integer.parseInt(request.getParameter("tid"));
    String s = request.getParameter("ttitle");
%>

<div>
    <div class="modal-header text-center bg-primary">

        <h5 class="modal-title text-white " id="exampleModalLabel">
            <%=s%>
        </h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
        </button>

    </div>
    <div id="Test-Detail" >
        <div class="modal-body">
            <div class="container text-center">

                <table class="text-primary table table-hover table-striping ">
                    <%
                        ExaminationDAO dao = new ExaminationDAO(ConnectionProvider.getConnection());
                        ArrayList<Question> m2 = dao.getQuestions(id);
                        int i = 1;
                        for (Question m1 : m2) {

                    %>
                     
                        <tr>
                            <th colspan="4"><span><span>Q-<%=i%></span><%=m1.getQue()%><button type="button" class="close" onclick="deleteQue(<%=m1.getId()%>,this)"  aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                    </button></span></th>
                        </tr>
                        <tr>
                            <td><span><input type="checkbox" name="ch1"><%=m1.getCh1()%></span></td>
                            <td><span><input type="checkbox" name="ch2"><%=m1.getCh2()%></span></td>
                            <td><span><input type="checkbox" name="ch3"><%=m1.getCh3()%></span></td>
                            <td><span><input type="checkbox" name="ch4"><%=m1.getCh4()%></span></td>

                        </tr>
                     
                    
                    <%
                            i++;
                        }
                    %>
                </table>
            </div>
        </div>
    </div>  
    <div class="modal-footer">
        <button type="submit" class="btn btn-primary" data-toggle='modal' data-target="#pos-modal">Add Now</button>
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
    </div> 
</div>
                <script>
                    
                </script>
<script>
    function deleteQue(a,b) {
        x=$(b);    
        y=$(x).parent().parent().parent();
                    z=$(y).next();
                    $(y).remove();
                    $(z).remove();
        $.ajax({
            url: "DeleteQuestionServ",
            data: {id: a},
            success: function(data) {
                console.log(data);
                if (data.toString().localeCompare("done") == 0) {
                    swal({
                        title: "done!",
                        text: "Question deleted succesfully!",
                        icon: "success"
                    });
                    
                }
                else {
                    swal({
                        title: "error!",
                        text: "Question not deleted!",
                        icon: "warning"
                    });
                }
            },
            error: function(data) {
                console.log(data);
                swal({
                    title: "error!",
                    text: "Question not deleted!",
                    icon: "warning"
                });
            }
        });
    }
</script>

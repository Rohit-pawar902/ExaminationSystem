<%-- 
    Document   : ShowTestDetail
    Created on : 22 Apr, 2021, 5:20:49 PM
    Author     : DELL
--%>

<%@page import="com.tech.entities.Question"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.entities.MockTest"%>
<%@page import="com.tech.dao.ExaminationDAO"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./css/hj.css" >
    </head>
    <body>
        <div class="row">
        <%
            ExaminationDAO dao = new ExaminationDAO(ConnectionProvider.getConnection());
            ArrayList<MockTest> m = dao.showAllTest();
            for (int i = 0; i < m.size(); i++) {
                MockTest m1 = m.get(i);
                
        %> 
        <div class="col-sm-6 mt-2">
            <!--<div class="">--> 

            <div class="card shadow-lg  w-100 h-100 rounded">
                <div class="card-header shadow-lg rounded  text-center text-primary "><%=m1.getTitle()%></div>
                <div class="card-body shadow-lg rounded "><%=m1.getDesc()%></div>
                <div class="card-footer shadow-lg rounded ">
                    <a class="card-link  btn-link   btn-outline-danger  text-justify m-1" id="get-id" onclick="setId(<%=m1.getId()%>)" data-toggle="modal" data-target="#pos-modal">add Question</a>
                    <a class="card-link   btn-link  btn-outline-danger  text-justify m-1" data-toggle="modal" data-target="#view-test" id="get-view" onclick='setView(<%=m1.getId()%>, "<%=m1.getTitle()%>")'  >View Test</a>
                    <a class="card-link btn-link  btn-outline-danger  text-justify m-1" onclick='deleteView(<%=m1.getId()%>, this)'  >Delete Test</a>
                    <a class="card-link  btn-link  btn-outline-danger  text-justify m-1" data-toggle="modal" data-target="#view-test" id="get-view" onclick='updateView(<%=m1.getId()%>, this)'  >Update Test</a>

                </div>
            </div>
        </div>
                    <%
                    if( m.size()>(i+1)){
                    MockTest m2 = m.get(++i);
                    %>
        <div class="col-sm-6 mt-2">
            <!--<div class="">--> 

            <div class="card shadow-lg  w-100 h-100 rounded">
                <div class="card-header shadow-lg rounded  text-center text-primary "><%=m2.getTitle()%></div>
                <div class="card-body shadow-lg rounded "><%=m2.getDesc()%></div>
                <div class="card-footer shadow-lg rounded ">
                    <a class="card-link  btn-link   btn-outline-danger  text-justify m-1" id="get-id" onclick="setId(<%=m2.getId()%>)" data-toggle="modal" data-target="#pos-modal">add Question</a>
                    <a class="card-link   btn-link  btn-outline-danger  text-justify m-1" data-toggle="modal" data-target="#view-test" id="get-view" onclick='setView(<%=m2.getId()%>, "<%=m2.getTitle()%>")'  >View Test</a>
                    <a class="card-link btn-link  btn-outline-danger  text-justify m-1" onclick='deleteView(<%=m2.getId()%>, this)'  >Delete Test</a>
                    <a class="card-link  btn-link  btn-outline-danger  text-justify m-1" data-toggle="modal" data-target="#view-test" id="get-view" onclick='updateView(<%=m2.getId()%>, this)'  >Update Test</a>

                </div>
            </div>
            <!--</div>-->
        </div>    
        <%
                    }
            }
        %>
        </div>
        
        
        <div class="modal fade" id="pos-modal" tabindex="-1" role="dialog" aria-labelledby="example1" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header text-center bg-primary">
                        <h5 class="modal-titleb " id="example1">Create Test</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">
                        <div class="col-md-12">
                            <form  id="post-question" method="post">
                                <div class="form-group">
                                    <label>Question</label>
                                    <input type="" name="question" id="course_name" class="form-control" placeholder="Input question" autocomplete="off">
                                </div>

                                <fieldset>
                                    <legend>Input word for choice's</legend>
                                    <div class="form-group">
                                        <label>Choice A</label>
                                        <input type="" name="choice_A" id="choice_A" class="form-control" placeholder="Input choice A" autocomplete="off">
                                    </div>

                                    <div class="form-group">
                                        <label>Choice B</label>
                                        <input type="" name="choice_B" id="choice_B" class="form-control" placeholder="Input choice B" autocomplete="off">
                                    </div>

                                    <div class="form-group">
                                        <label>Choice C</label>
                                        <input type="" name="choice_C" id="choice_C" class="form-control" placeholder="Input choice C" autocomplete="off">
                                    </div>

                                    <div class="form-group">
                                        <label>Choice D</label>
                                        <input type="" name="choice_D" id="choice_D" class="form-control" placeholder="Input choice D" autocomplete="off">
                                    </div>

                                    <div class="form-group">
                                        <label>Correct Answer</label>
                                        <input type="" name="correctAnswer" id="" class="form-control" placeholder="Input correct answer" autocomplete="off">
                                    </div>
                                </fieldset>

                                <div class="modal-footer">
                                    <button type="submit" class="btn btn-primary">Add Now</button>
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                </div>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="modal fade" id="view-test" tabindex="-1" role="dialog" aria-labelledby="example2" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div  id="kl">
                    </div>
                </div>
            </div>
        </div>
        <script>
            function deleteView(a, b) {
//                $(b).parent().parent().remove();
                c = 1;
                $.ajax({
                    url: "/TestYourSkill//DelUpdTestServ",
                    data: {tid: a, oper: c},
                    success: function(data) {
                        console.log(data);
                        if (data.toString().localeCompare("done") == 0) {
                            swal({
                                title: "done!",
                                text: "Changes performed",
                                icon: "success"
                            });
                            $(b).parent().parent().remove();
                        }
                        else {
                            swal({
                                title: "error!",
                                text: "Changes not performed",
                                icon: "warning"
                            });
                        }
                    },
                    error: function(data) {
                        console.log(data);
                        swal({
                            title: "error!",
                            text: "Changes not performed",
                            icon: "warning"
                        });
                    }
                });
            }
            function updateView(a, b) {
                $.ajax({
                    url: "DelUpdTestServ",
                    data: {tid: a, type: 2},
                    success: function(data) {
                        console.log(data);
                        if (data.toString().localeCompare("done") == 0) {
                            swal({
                                title: "done!",
                                text: "Changes performed",
                                icon: "success"
                            });
                            $(b).parent().parent().remove();
                        }
                        else {
                            swal({
                                title: "error!",
                                text: "Changes not performed",
                                icon: "warning"
                            });
                        }
                    },
                    error: function(data) {
                        console.log(data);
                        swal({
                            title: "error!",
                            text: "Changes not performed",
                            icon: "warning"
                        });
                    }
                });
            }
        </script>
        <script>
            var id = 0;
            function setId(a) {
                id = a;
                console.log(a);
            }
        </script>
        <script>
            $(document).ready(function() {

                $("#post-question").on("submit", function(e) {
                    e.preventDefault();
                    console.log("hii");
                    console.log(id);
                    let form = new FormData(this);
                    form.append("tid", id);
                    $.ajax({
                        url: "/TestYourSkill//AddQuestionServ",
                        type: "POST",
                        data: form,
                        success: function(data, textStatus, jqXHR) {
                            console.log("question succefully added");
                            swal({
                                title: "done!",
                                text: "question succefully added",
                                icon: "success"
                            });
                            $('#post-question').trigger("reset");
                        },
                        error: function(data, textStatus, jqXHR) {
                            console.log(data);
                            swal({
                                title: "done!",
                                text: "Technical error",
                                icon: "warning"
                            });
                            console.log("question succefully not added");
                            $('#post-question').trigger("reset");
                        },
                        processData: false,
                        contentType: false
                    });
                });
            });


        </script>
        <script>
            function setView(a, b) {

                console.log("ghjhj");
                $.ajax({
                    url: "showTestView.jsp",
                    data: {tid: a, ttitle: b},
                    success: function(data, textStatus, jqXHR) {
                        console.log("question added");
                        swal({
                            title: "done!",
                            text: "Technical",
                            icon: "success"
                        });
                        console.log(data);
                        $("#kl").html(data);
                    },
                    error: function(data, textStatus, jqXHR) {
                        console.log(data);
                        swal({
                            title: "done!",
                            text: "Technical error",
                            icon: "warning"
                        });
                    }
                });
            }
        </script>

    </body>
</html>

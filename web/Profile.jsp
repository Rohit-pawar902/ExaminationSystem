<%-- 
    Document   : Profile
    Created on : 19 Apr, 2021, 4:32:33 PM
    Author     : DELL
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.entities.MockTest"%>
<%@page import="com.tech.dao.ExaminationDAO"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page import="com.tech.entities.Student"%>
<%@page import="com.tech.entities.Examinee"%>
<%@page import="com.tech.entities.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%    Student n = (Student) session.getAttribute("currentUser");
    if (n != null) {
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .card-body{
                background-image: linear-gradient(white);
            }
        </style>
    </head>
    <body>
        <%@include file="AdminNav.html" %>

        <h1 class="text-center">Hello <%=n.getName()%></h1>
        <span id="1st"><i class="fa fa-gear fa-spin ml-1 pl-1"  style="font-size:48px;color:white;"></i></span> 
        <div class="container">
            <div class="row">
                <div class="col-md-3 " id="bar">
                    <div class="list-group w-100" value="0" id="catagorie-list">
                        <div class="list-group-item list "><button class="btn btn-warning w-100" id="c-test">Free Tests</button> </div>
                        <div class="list-group-item list "><button class="btn btn-warning w-100" id="e-test">Examinee Tests</button> </div>
                        <div class="list-group-item list "><button class="btn btn-warning w-100" id="s-result">Results</button> </div>

                        <div class="list-group-item list "><button class="btn btn-warning w-100" id="load-test">Loaded Tests</button> </div>

                    </div>
                </div>

                <div class="col-sm-9">
                    <div class="container-fluid" id="ctest">

                        <div class="d-flex flex-wrap" >

                            <%
                                ExaminationDAO dao = new ExaminationDAO(ConnectionProvider.getConnection());
                                ArrayList<MockTest> m = dao.showAllTest();
                                for (int i = 0; i < m.size() - 1; i++) {
                                    MockTest m1 = m.get(i);

                            %>



                            <!--<div class="">--> 

                            <div class="card m-5" style=" width:200px;height:250px">
                                <div class="card-header shadow-lg rounded  text-center text-primary "><%=m1.getTitle()%></div>
                                <div class="card-body shadow-lg rounded ">
                                    <div class="card-text "><%=m1.getDesc()%></div>
                                </div>
                                <div class="card-footer shadow-lg rounded text-center ">
                                    <a class="card-link  btn btn-link btn-outline-danger  text-center" id="get-id" onclick="loadTest(<%=m1.getId()%>)" data-toggle="modal" data-target="#pos-modal">Start Test</a>
                                </div>
                            </div>

                            <%
                                }
                            %>

                        </div>
                    </div>

                    <div class="container" id="etest">
                        <div class="card rounded-circle w-100 p-4">
                            <div class="card-header text-center">
                                <h1 class="lead text-center text-primary">Private Test Login</h1>
                            </div>
                            <div class="card-body">
                                <form id="e-login" method="post">
                                    <div class="form-group">
                                        <label>Examinee name:</label>
                                        <input type="text" name="Ename" placeholder="Enter Name of Examinee" class="form-control" required="true"> 
                                    </div>
                                    <div class="form-group">
                                        <label>Password:</label>
                                        <input type="Password" name="Epass" placeholder="Enter Password" class="form-control" required="true">
                                    </div>
                                    <div class="form-group">
                                        <input id="e-submit" type="submit" value="submit" class=" btn btn-primary form-control">
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="container" id="loadtest">

                    </div>
                    <div class="conainer" id="loadresult">

                    </div>
                </div>
            </div>
        </div>


        <script>
            $(document).ready(function() {
                $("#bar").hide();
                $("#1st").on("click", function(e) {
                    e.preventDefault();
                    console.log("click");
                    $("#bar").toggle();
                });
            });

            $(document).ready(function() {
                $("#ctest").hide();
                $("#etest").hide();
                $("#load-test").hide();
                $("#e-result").hide();
                $("#c-test").on("click", function(e) {
                    e.preventDefault();
                    $("#etest").hide();
                    $("#loadtest").hide();
                    $("#ctest").toggle();
                });
            });
            $(document).ready(function() {
                $("#e-test").on("click", function(e) {
                    e.preventDefault();
                    $("#ctest").hide();
                    $("#loadtest").hide();
                    $("#etest").toggle();
                });
            });
            $(document).ready(function() {
                $("#load-test").on("click", function(e) {
                    e.preventDefault();
                    $("#ctest").hide();
                    $("#etest").hide();
                    $("#loadtest").toggle();
                });
            });
            $(document).ready(function() {
                $("#s-result").on("click", function(e) {
                    e.preventDefault();
                    console.log("click2");
                    $.ajax({
                        url: "GetStuResult.jsp",
                        type: "POST",
                        success: function(data, textStatus, jqXHR) {
                            console.log("Success");
                            console.log(data);
                            $("#loadresult").html(data);
                            

                        },
                        error: function(data, textStatus, jqXHR) {
                            console.log("error");
                            console.log(data);
                        }
                    });
                });
            });
            $(document).ready(function() {

                $("#e-login").on("submit", function(e) {
                    e.preventDefault();
                    $("#e-submit").hide();
                    let form = new FormData(this);
                    f1 = form.get("Ename");
                    f = form.get("Epass");
                    console.log(f + f1);
                    $.ajax({
                        url: "StuExamineeSubmitServ",
                        type: "POST",
                        data: {Ename: f1, Epass: f},
                        success: function(data, textStatus, jqXHR) {
                            console.log(data);
                            if (data === 0) {
                                alert("wrong information");
                            }
                            else {
                                fun(data);
                            }
                            $("#e-submit").show();

                        },
                        error: function(data, textStatus, jqXHR) {
                            console.log(data);
                            $("#e-submit").show();
                        }
                    });
                });
            });

            function fun(d) {
                console.log(d);
                $.ajax({
                    url: "SETestShow.jsp",
                    data: {eid: d},
                    success: function(data, textStatus, jqXHR) {
                        console.log(data);
                        $("#etest").hide();
                        $("#loadtest").html(data);
                        $("#load-test").show();
                        $("#loadtest").show();

                    },
                    error: function(data, textStatus, jqXHR) {
                        console.log(data);
                    }
                });
            }

            function loadTest(b) {
                console.log(b);
//               replace
//               window.location.href="StuTestPage.jsp";     
                window.location.href = "StuTestPage.jsp?tid=" + b + "";
            }

            function setId(b) {
                console.log(b);
//               replace
//               window.location.href="StuTestPage.jsp";     
                window.location.href = "StuETestPage.jsp?tid=" + b + "";
            }
        </script>

    </body>
</html>
<%
    }
%>
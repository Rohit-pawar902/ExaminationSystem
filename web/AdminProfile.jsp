<%-- 
    Document   : AdminProfile
    Created on : 19 Apr, 2021, 5:09:25 PM
    Author     : DELL
--%>

<%@page import="com.tech.entities.Student"%>
<%@page import="com.tech.entities.Examinee"%>
<%@page import="com.tech.entities.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%    Admin n = (Admin) session.getAttribute("currentUser");
    if (n != null) {

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="AdminNav.html" %>
        <h1 class="text-center"><%=n.getName()%></h1>
        <span id="1st"><i class="fa fa-gear fa-spin ml-1 pl-1"  style="font-size:48px;color:white;"></i></span> 

        <div class="container">
            <div class="row">
                <div class="col-md-3" id="bar">
                    <div class="list-group w-100  list shadow-lg rounded " value="0" id="catagorie-list">
                        <div class="list-group-item list shadow-lg "> <a class="h5 mx-3 px-1" href="!#" data-toggle="modal" data-target="#post-modal"><span class="fa fa-user  ml-1 pl-1"></span>Create Test</a></div>

                        <div class="list-group-item  d-block  list shadow-lg"><a class="h5 mx-3 px-1" href="!#" id="stu-detail">Students Details</a></div>
                        <div class="list-group-item  d-block  list shadow-lg"><a class="h5 mx-3 px-1" href="!#" id="exa-detail">Examineee Details</a></div>

                        <div class="list-group-item  list shadow-lg"><a class="h5 mx-3 px-1" href="!#" id="test-created" >Tests</a></div>
                        <div class="list-group-item  list shadow-lg"><a class="h5 mx-3 px-1" id="stu-res" >Students Results</a></div>

                    </div>
                </div>
                <div class="col-md-8" id="con">

                    <div class="container" id="show-test"><!--test created-->


                    </div>
                    <div class="container" id="s-d"><!--student deatil-->
                        <div class="row">
                            <div class="col-md-12">
                                <div class="conatiner" id="stu" >
                                    <div class="col-md-12 card-group">

                                        <div class="container text-center " id="loader">
                                            <i class="fa fa-refresh fa-4x fa-spin"></i>
                                            <h2 class="mt-2">Loading...</h2>
                                        </div>
                                        <div class="container" id="show-detail">


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="container" id="e-d"><!--examinee deatil-->
                        <div class="row">
                            <div class="col-md-12">
                                <div class="conatiner" id="exa" >
                                    <div class="col-md-12 card-group">

                                        <div class="container text-center " id="loader1">
                                            <i class="fa fa-refresh fa-4x fa-spin"></i>
                                            <h2 class="mt-2">Loading...</h2>
                                        </div>
                                        <div class="container" id="e-detail">


                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>


        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="conatiner" id="stu2" >
                        <div class="col-md-12 card-group">

                            <div class="container text-center " id="loader3">
                                <i class="fa fa-refresh fa-4x fa-spin"></i>
                                <h2 class="mt-2">Loading...</h2>
                            </div>
                            <div class="container" id="show-res">


                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>





        <div class="modal fade" id="post-modal" tabindex="-1" role="dialog" aria-labelledby="example1" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header text-center bg-primary">
                        <h5 class="modal-titleb " id="example1">Create Test</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">
                        <form  id="post-test" method="post" enctype="multipart/form-data">
                            <div class="form-group">
                                <div class="form-group">
                                    <input type="text" placeholder="Enter the Title" name="Ttitle"   class="form-control"> 
                                </div>
                                <div class="form-group">
                                    <textarea  class="form-control " style="height:300px;" name="Tdesc" placeholder="Enter the Description"></textarea>  
                                </div>
                                <div class="form-group">
                                    <input type="number" placeholder="Enter the timeLimit in sec" name="Tlimit"   class="form-control"> 
                                </div>
                                <div>
                                    <input type="number" onkeyup="" placeholder="Enter number of Question" name="TQue" id="no-que" class="form-control"> 
                                </div>
                                <div class="form-group text-capitalize text-center">
                                    <input type="submit" value="submit" class="btn btn-primary" >
                                </div>
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div>
                </div>
            </div>
        </div>










        <%
        } else {
        %>
        <h1>Hello World!</h1>
        <h1 class="text-center"><%=n%></h1>
        <%
            }
        %>
        <script>
            $(document).ready(function() {
                $("#loader3").hide();
                $("#loader1").hide();
                $("#loader").hide();
                $("#bar").hide();
                res = false;
                $("#stu-res").on("click", function(e) {
                    e.preventDefault();
                    console.log("ma hu khal nayak");
                    if (res) {
                        $("#show-res").toggle();
                    }
                    else {
                        $.ajax({
                            url: "LoadResult.jsp",
                            success: function(data) {
                                console.log(data);
                                res = true;
                                $("#loader3").hide();
                                $("#show-res").html(data);
                            },
                            error: function(data) {
                                console.log(data);
                            }
                        });
                    }
                });
            });
            $(document).ready(function() {
                $("#bar").hide();
                $("#1st").on("click", function(e) {
                    e.preventDefault();
                    console.log("click");
                    $("#bar").toggle();
                });
            });
        </script>



        <script>
            $('document').ready(function() {
                flag = false;
                $("#stu-detail").on("click", function(e) {
                    e.preventDefault();
                    if (flag) {
                        $("#show-detail").toggle();
                    }
                    else {
                        $("#loader").hide();
                        $("#show-detail").show();
                        $.ajax({
                            url: "ShowStudentDetail.jsp",
                            success: function(data, textStatus, jqXHR) {
                                $("#show-detail").html(data);
                                flag = true;
                            },
                            error: function(data, textStatus, jqXHR) {
                                console.log("faliure");
                            }
                        });
                    }
                });
            });

        </script>
        <script>
            $('document').ready(function() {
                flag1 = false;
                $("#exa-detail").on("click", function(e) {
                    e.preventDefault();
                    $("#loader").show();
                    if (flag1) {
                        $("#loader").hide();
                        $("#s-d").hide();
                        $("#show-test").hide();
                        $("#e-d").toggle();
                    }
                    else {
                        $("#s-d").hide();
                        $("#e-d").show();
                        $.ajax({
                            url: "ShowExamineeDetail.jsp",
                            success: function(data, textStatus, jqXHR) {
                                $("#e-detail").html(data);
                                $("#loader").hide();
                                flag1 = true;
                            },
                            error: function(data, textStatus, jqXHR) {
                                console.log("faliure");
                                $("#loader").hide();
                            }
                        });
                    }
                });
            });

        </script>
        <script>
            $('document').ready(function() {
                f = false;
                $("#test-created").on("click", function(e) {
                    e.preventDefault();

                    if (f) {
                        $("#show-test").toggle();
                    } else {
                        $("#loader1").hide();
                        $("#show-test").show();
                        $.ajax({
                            url: "ShowTestDetail.jsp",
                            success: function(data, textStatus, jqXHR) {
                                $("#show-test").html(data);
                                console.log("success");
                                f = true;
                            },
                            error: function(data, textStatus, jqXHR) {
                                console.log("faliure");
                            }
                        });
                    }
                });
            });

        </script>

        <script>
            $('document').ready(function() {
                $("#post-test").submit(function(e) {
                    e.preventDefault();
                    console.log("submit");
                    let form = new FormData(this);
                    $.ajax({
                        url: "/TestYourSkill//TestServ",
                        type: "POST",
                        data: form,
                        success: function(data, textStatus, jqXHR) {
                            console.log(data);
                            if (data.toString().localeCompare("done") == 0) {
                                swal({
                                    title: "done!",
                                    text: "You sucessfully Created Test!",
                                    icon: "success",
                                });
                                location.reload();
                            }
                            else {
                                swal({
                                    title: "Error!",
                                    text: "Test not created try Again!",
                                    icon: "warning",
                                });
                            }
                        },
                        error: function(data, textStatus, jqXHR) {
                            console.log(data);
                            swal({
                                title: "Error!",
                                text: "Test not created try Again!",
                                icon: "warning",
                            });
                        },
                        processData: false,
                        contentType: false

                    });
                });


            });

        </script>
    </body>
</html>
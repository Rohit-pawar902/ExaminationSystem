<%-- 
    Document   : ExamineeProfile.jsp
    Created on : 19 Apr, 2021, 5:11:12 PM
    Author     : DELL
--%>

<%@page import="com.tech.entities.ExamineeMockTest"%>
<%@page import="com.tech.entities.TestCategory"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.helper.ConnectionProvider"%>
<%@page import="com.tech.dao.ExamineeExaminationDAO"%>
<%@page import="com.tech.entities.Student"%>
<%@page import="com.tech.entities.Examinee"%>
<%@page import="com.tech.entities.Admin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%    Examinee n = (Examinee) session.getAttribute("currentUser");
    if (n != null) {
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="AdminNav.html" %>
        <h1 class="text-center text-capitalize">Examinee : <%=n.getName()%></h1>
        
        <div class="container">
            <div class="row">
                <div class="col-md-3" id="bar">
                    <div class="list-group w-100  list shadow-lg rounded " value="0" id="catagorie-list">
                        <div class="list-group-item list shadow-lg "> <a class="h5 mx-3 px-1" href="!#" data-toggle="modal" data-target="#create-test"><span class="fa fa-user  ml-1 pl-1"></span>Create Test</a></div>
                        <div class="list-group-item  list shadow-lg"><a class="h5 mx-3 px-1" href="!#" id="show-test" >Tests</a></div>
                         <div class="list-group-item  list shadow-lg"><a class="h5 mx-3 px-1" id="stu-res" >Students Results</a></div>
                    </div>
                </div>
                <div class="col-md-8 mt-3 p-2" id="con">

                    <div class="container m-2 p-2" id="s-test">


                    </div>
                    <div class="container m-2 p-2" id="s-result">


                    </div>

                </div>
            </div>
        </div>
        <div class="modal fade" id="create-test" tabindex="-1" role="dialog" aria-labelledby="example1" aria-hidden="true">
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
                                    <select name="catid"   class="form-control" >
                                        <option selected diabled >select catagorie</option>
                                        <%
                                            ExamineeExaminationDAO temp = new ExamineeExaminationDAO(ConnectionProvider.getConnection());
                                            ArrayList<TestCategory> arr = temp.getAllCategory();
                                            for (TestCategory t : arr) {
                                        %>
                                        <option class="form-control" value="<%= t.getId()%>"><%=t.getCatName()%></option>
                                        <%
                                            }
                                        %>
                                    </select>
                                </div>
                                <div class="form-group invisible ">
                                    <input type="number" name="eid" value="<%=n.getId()%>"  class="form-control"> 
                                </div>
                                <div class="form-group">
                                    <input type="text" placeholder="Enter the Title" name="Ttitle"   class="form-control"> 
                                </div>
                                <div class="form-group">
                                    <input type="Password" placeholder="Enter the Password" name="Tpass"   class="form-control"> 
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

        <div class="container" id="show">
            <div class="container text-center " id="loader1">

            </div>
            <div class="container" id="view-test">
                <%
                    ExamineeExaminationDAO dao = new ExamineeExaminationDAO(ConnectionProvider.getConnection());
                    ArrayList<ExamineeMockTest> m = dao.showExamineeTest(n.getId());
                    for (ExamineeMockTest m1 : m) {
                %>
                <div class="card shadow-lg rounded">
                    <div class="card-header shadow-lg rounded  text-center text-primary "><%=m1.getName()%></div>
                    <div class="card-body shadow-lg rounded ">
                        <form id="test-detail">
                            <div class="lead">Descreption:<input type="text" class="form-control" value="<%=m1.getDescription()%>" name="des"  ></div>
                        <div class="lead">Test Password:<input type="text"  class="form-control" value="<%=m1.getPassword()%>" name="pass"></div>
                        <div class="lead">TestCreated:<input type="text"  class="form-control" value="<%=m1.getDate() %>"    name="date"  readonly="true"></div>
                        <div class="lead">Time(in min):<input type="text"  class="form-control"  value="<%=m1.getTimeLimit() %>" name="time"></div>
                        </form>
                    </div>
                    <div class="card-footer shadow-lg rounded ">
                        <a class="card-link  btn-link   btn-outline-danger  text-justify m-1" id="get-id" onclick="setId(<%=m1.getEtid()%>)" data-toggle="modal" data-target="#pos-modal">add Question</a>
                        <a class="card-link   btn-link  btn-outline-danger  text-justify m-1" data-toggle="modal" data-target="#Eview-test" id="get-view" onclick='setView(<%=m1.getEtid()%>, "<%=m1.getName()%>")'  >View Test</a>
                        <a class="card-link btn-link  btn-outline-danger  text-justify m-1" onclick='deleteView(<%=m1.getEtid()%>, this)'  >Delete Test</a>
                        <a class="card-link  btn-link  btn-outline-danger  text-justify m-1" type="submit" id="get-view" onclick='updateView(<%=m1.getEtid()%>, this)'  >Update Test</a>
                    </div>
                </div>    
                <%
                    }
                %>
            </div>
        </div>                            

            <div class="modal fade" id="pos-modal" tabindex="-1" role="dialog" aria-labelledby="example1" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header text-center bg-primary">
                        <h5 class="modal-titleb text-center text-white " id="example1">Add Question</h5>
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
        <div class="modal fade" id="Eview-test" tabindex="-1" role="dialog" aria-labelledby="example2" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div  id="kl">
                    </div>
                </div>
            </div>
        </div>
        <script>
            $(document).ready(function(){
               $("#stu-res").click(function(e){
                  e.preventDefault();
                  console.log("clicked-res");
                  $.ajax({
                      url:"EShowResult.jsp",
                      type:"post",
                      data:{'eid':<%=n.getId()%>},
                      success:function(data,status,jqxhr){
                          console.log(data);
                          $('#s-result').html(data);
                          swal({
                                title: "done!",
                                text: "Changes performed",
                                icon: "success"
                            });
                           
                      },
                      error:function(data,status,jqxhr){
                          console.log(data);
                          swal({
                                title: " not done!",
                                text: "Changes not performed",
                                icon: "error"
                            });
                      } 
                  });
               }); 
            });
            
            
            
            
            function deleteView(a, b) {
//                $(b).parent().parent().remove();
                c = 1;
                $.ajax({
                    url: "EDelUpdTestServ",
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
//               let a= $("#test-detail");
//                let form=new FormData(a);
                $.ajax({
                    url: "EDelUpdTestServ",
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
            function setId(a) {
                id = a;
                console.log(a);
                $("#post-question").on("submit", function(e) {
                    e.preventDefault();
                    console.log("hii");
                    console.log(id);
                    let form = new FormData(this);
                    form.append("tid", id);
                    x=form.get("tid");
                    console.log(x);
                    $.ajax({
                        url: "EAddQuestionServ",
                        type: "POST",
                        data: form,
                        success: function(data, textStatus, jqXHR) {
                            console.log("question succefully added");
                             if (data.toString().localeCompare("done") == 0) {
                            swal({
                                title: "done!",
                                text: "Changes performed",
                                icon: "success"
                            });
                        
                        }
                        else {
                            swal({
                                title: "error!",
                                text: "Changes not performed",
                                icon: "warning"
                            });
                        }
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
            }


        </script>
        <script>
            function setView(a, b) {

                console.log("ghjhj");
                $.ajax({
                    url: "EShowTestView.jsp",
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


        <script>
            $(document).ready(function() {
                $("#post-test").on("submit", function(e) {
                    e.preventDefault();
                    console.log("submit");
                    let form = new FormData(this);
                    $.ajax({
                        url: "ETestCreateServ",
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

             

            $(document).ready(function() {
                f = false;
                $("#show").hide();
                $("#show-test").on("click", function(e) {
                    e.preventDefault();
                    console.log("clicked");
                   if (!f) {
                    let data= $("#show").html();
                    $("#s-test").html(data); 
                    f=true;
                   }
                   else{
                       $("#s-test").toggle();
                   }
//                    else {
//                        x = $(this).val();
//                        console.log("click");
//                        $.ajax({
//                            url: "ShowTestDetail.jsp",
//                            data: {eid: x},
//                            success: function(data) {
//                                f = true;
//                                console.log(data + "sucesss");
//                                $("#view-test").html(data);
//                            },
//                            error: function(data) {
//                                console.log(data + "sucesss");
//                            }
//                        });
//                    }
                });

            });
        </script>

    </body>
</html>
<%
    }
%>

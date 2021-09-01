<%-- 
    Document   : ExamRegistration
    Created on : 16 Apr, 2021, 2:59:29 PM
    Author     : DELL
--%>

<%@page import="com.tech.entities.Admin"%>
<%@page import="com.tech.entities.Student"%>
<%@page import="com.tech.entities.Examinee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Object u = session.getAttribute("currentUser");
    if (u != null) {
        if(u instanceof Examinee){
        response.sendRedirect("ExamineeProfile.jsp");
        }
        else if(u instanceof Student){
        response.sendRedirect("Profile.jsp");
        }
        else if(u instanceof Admin){
        response.sendRedirect("AdminProfile.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <%@include file="Normal_nav.html" %>
        <form method="post" action="RegisterServ" id="s5">
            <div id="jadoun">
                <center>
                    <table cellpadding="12px">
                        <tr>
                            <th class="jkm text-center" colspan="2">Examiner Registration</th>
                        </tr>
                        <tr>
                            <td class="jk">FullName</td>
                            <td><input type="text" placeholder="Enter Name" class="j" onkeyup="name2()" id="name" name="uname"><br>
                                <span id="name1">  </span></td>
                        </tr>
                        <tr>
                            <td class="jk">Email</td>
                            <td><input type="email" placeholder="Enter Email" class="j" onkeyup="mail2()" onkeydown="match()" id="E1" name="uemail" required><br>
                                <span id="E2">  </span></td>
                        </tr>
                        <tr>
                            <td class="jk">Password</td><br>
                        <td><input type="password" placeholder="Enter Password" class="j" onkeyup="pass()" id="p1" name="upass" required><br>
                            <span id="s1" align="right">  </span></td>
                        </tr>
                        <tr>
                            <td class="jk">Confirm Password</td>
                            <td><input type="text" placeholder="Re-Enter Password" class="j" onkeyup="match()" id="p2" name="u" required><br>
                                <span id="s2">  </span></td>
                        </tr>
                        <tr>
                            <td class="jk">Test Access Password</td><br>
                        <td><input type="password" placeholder="Enter Test Access Password" class="j" onkeyup="pass()" id="p1" name="ucpass" required><br>
                            <span id="s1" align="right">  </span></td>
                        </tr>
                        <tr>
                            <td class="jk">Date Of Birth</td>
                            <td><input type="date" placeholder="Enter Password" class="j" id="DOB1" name="DOB" required><br>
                                <span id="DOB2">  </span></td>
                        </tr>
                        <tr>
                            <td class="jk">Gender</td>
                            <td> <div class="form-check  d-inline-block mb-2">

                                    <input class="form-check-input" name="ugen" type="radio" id="exampleInputGender" value="male">
                                    <label class="form-check-label" for="exampleInputGender">
                                        Male
                                    </label>

                                </div>
                                <div class="form-check d-inline-block mb-2 ">
                                    <input class="form-check-input" type="radio" name="ugen" id="exampleInputGender"  value="female">
                                    <label class="form-check-label" for="exampleInputGender">
                                        Female
                                    </label>
                                </div></td>
                        </tr>
                        <tr>
                            <td class="jk">TeachingField<span class="text-muted">(Cs/Mech)</span></td>
                            <td><input type="text" placeholder="Enter TeachingField" class="j" id="DOB1" name="eduField" required><br>
                                <span id="DOB2">  </span></td>
                        </tr>
                        <tr>
                            <td class="jk">Mobile Number</td>
                            <td><input type="tel" placeholder="Enter Contact" class="j" onkeyup="contact2()" id="CN1" name="umob" required><br>
                                <span id="CN2">  </span></td>
                        </tr>
                         <tr>
                            <td class="jk"> Check me out</td>
                            <td>
                                <div class="form-check">
                                    <input type="checkbox" name="check" value="2" class="j form-check-input" id="exampleCheck1">
                                </div>
                            </td>
                        </tr>
                         <tr>	
                            <th colspan="2">
                        <div class="text-center">
                            <input type="submit" value="Register!!" id="sub" class="y">
                        </div>
                        </th>
                        </tr>
                    </table>
                </center>
            </div>
        </form>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <!--  Scripts-->
        <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script src="js/materialize.js"></script>
        <script src="js/init.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="js/jquery.min.js"></script>
        <script>
                                $('document').ready(function() {
                                    //$("#loader").hide();

                                    $('#s5').submit(function(e) {
                                        e.preventDefault();
                                        let form = new FormData(this);
                                       // console.log("submit");
                                        x = form.get("check");
                                        if (x == null)
                                        {
                                            swal({
                                                title: "Error!",
                                                text: " please check the box!",
                                                icon: "warning",
                                            });

                                        }
                                        else {
                                           // console.log("you are in");
                                            $('#sub').hide();
                                            $.ajax({
                                                url: "/TestYourSkill//RegisterServ",
                                                type: 'POST',
                                                data: form,
                                                success: function(data, textStatus, jqXHR) {
                                                    console.log("you successfully looged in" + data);
                                                    if (data.toString().localeCompare("done") == 0) {
                                                        swal({
                                                            title: "done!",
                                                            text: "You Registered succesfully!",
                                                            icon: "success",
                                                        }).then((value)=>{
                                                            if(value){
                                                            location.href="Login.jsp";
                                                           }
                                                           else{
                                                              location.href="Login.jsp"; 
                                                           }
                                                        });
                                                          
                                                        
                                                    }
                                                    else {
                                                      
                                                          swal({
                                                            title: "Error!",
                                                            text: "You have been already Registered succesfully!",
                                                            icon: "warning",
                                                        }).then((value)=>{
                                                            if(value){
                                                            location.href="Login.jsp";
                                                           }
                                                           else{
                                                              location.href="Login.jsp"; 
                                                           }
                                                        });
                                                          
                                                     
                                                            
                                                    }
                                                    $('#sub').show();
                                                },
                                                error: function(data, textStatus, jqXHR) {
                                                    console.log(data + " " + textStatus + " " + jqXHR);
                                                    swal({
                                                        title: "done!",
                                                        text: "Technical error",
                                                        icon: "warning",
                                                    });
                                                },
                                                processData: false,
                                                contentType: false
                                            });
                                           // console.log("you are in");
                                        }
                                    });
                                });

        </script>
    </body>
</html>	
</body>
</html>

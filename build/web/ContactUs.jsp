<%-- 
    Document   : ContactUs
    Created on : 9 Jun, 2021, 1:57:06 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="Normal_nav.html" %>
    </head>
    <body>

        <div class="container col-md-6 card">
            <div class="text-center h1 text-capitalize m-2 p-2">Contact Us</div>
                        <form id="contactF" method="post">
                           
                            <div class="form-group">
                                <label for="inputEmail4">UserName</label>
                                <input type="username" class="form-control" id="inputname4" name="uname" paceholder="Enter the username">
                            </div>
            
            
                            <div class="form-group">
                                <label for="inputEmail4">Email</label>
                                <input type="email" class="form-control" id="inputEmail4" name="uemail"paceholder="Enter the Email">
                            </div>
            
                            <div class="form-group">
                                <label for="inputAddress2">*Message</label>
                                <textarea type="text" class="form-control" id="inputAddress2" name="umsg" placeholder="Enter Message in well mannered form"></textarea>
                            </div>
            
                             
                                <div class="form-group">
                                    <label for="inputCity">City</label>
                                    <input type="text" class="form-control" name="ucity" id="inputCity">
                                </div>
                            
                            <div class="form-group">
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" name="check" id="gridCheck">
                                    <label class="form-check-label" for="gridCheck">
                                        Check me out
                                    </label>
                                </div>
                            </div>
                            <button type="submit" value="submit" class="btn btn-primary m-2 p-2" id="sub">Submit</button>
                        </form>
             
        </div>
    </body>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script>
        $(document).ready(function() {
            console.log("hii");
            $("#contactF").on('submit', function(e) {
                e.preventDefault();
                console.log("hii2");
                let form = new FormData(this);
                for(let key of form){
                    console.log(key);
                }
                $('#sub').hide();
                $.ajax({
                    url: "/TestYourSkill//ContactSubServ",
                    type: 'post',
                    data: form,
                    success: function(data, status, jxhr) {
                        console.log(data);
                        swal({
                            title: "Good job!",
                            text: "You submited feedback",
                            icon: "success"
                        });
                        $('#sub').show();
                    },
                    error: function(data, status, jxhr) {
                        swal({
                            title: "bad!",
                            text: "You not submited feedback",
                            icon: "error"
                        });
                        $('#sub').show();
                    },
                    processData: false,
                    contentType: false
                });
            });
        });
    </script>
</html>

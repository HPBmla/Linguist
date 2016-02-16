<%--
    Document   : imageView
    Created on : Feb 1, 2016, 10:03:08 PM
    Author     : Bimla Madhavee
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="/Linguist/css/bootstrap.css" rel="stylesheet">
    <link href="/Linguist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/Linguist/css/style.css" rel="stylesheet">
    <link href="/Linguist/css/otherStyles.css" rel="stylesheet">
    <script src="/Linguist/js/bootstrap.min.js"></script>
    <script src="/Linguist/js/jquery.min.js"></script>
    <script src="/Linguist/js/bootstrap-datepicker.js"></script>
    <script src="/Linguist/js/uploadimg.js"></script>

    <%@include file="navigationBar.jsp" %>
    <section class="bg-light-gray">
        <div class="container ">
            <div class="row ">
                <div  id = "imageView" class="col-lg-8 center-block ">
                    <form action="ImagePreprocess" method="post" class=" form" role="form" enctype="multipart/form-data">
                        <input type="submit" class= "btn btn-image pull-left" value="OCR">
                    </form>

                    <a href="home.jsp" class="btn btn-default bg-light-gray">Upload a new Image</a>

                </div>

            </div>
            <%
                String fname = (String) request.getAttribute(" name ");
                session.setAttribute("filename", fname);
            %>

            <div class="row">
                <div  id = "display" class="col-lg-8 center-block "><img src="C:\Users\User\Documents\GitHub\Linguist\uploadedImage\<%=fname%>" width="300" height="500" alt="image"/>

                    <!--    <div id ="inner-disply" class=" col-lg-8 center-block " ><img src= "pink.jpg" height ="300" width="400"/>

</div>-->
                    <p> <%=fname%>
                </div>

            </div>

        </div>


    </section>

    <%@include file="footer.jsp" %>
</html>

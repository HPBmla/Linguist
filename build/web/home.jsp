<%--
    Document   : home
    Created on : Jan 13, 2016, 8:58:47 AM
    Author     : Bimla Madhavee
--%>
<link href="/Linguist/css/bootstrap.css" rel="stylesheet">
<link href="/Linguist/css/bootstrap.min.css" rel="stylesheet">
<link href="/Linguist/css/style.css" rel="stylesheet">
<link href="/Linguist/css/otherStyles.css" rel="stylesheet">
<script src="/Linguist/js/bootstrap.min.js"></script>
<script src="/Linguist/js/jquery.min.js"></script>
<script src="/Linguist/js/bootstrap-datepicker.js"></script>
<script src="/Linguist/js/uploadimg.js"></script>



<!-- navigation-->
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header page-scroll">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>

        <div class="collapse navbar-collapse " id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right ">
                <li class="hidden">
                    <a href="#page-top"></a>
                </li>
                <li>
                    <a class="page-scroll" href="#about">About Us</a>
                </li>
                <li>
                    <a class="page-scroll" href="#Community">Community</a>
                </li>
                <li>
                    <a class="page-scroll" href="#OCR">OCR</a>
                </li>
                <li>
                    <a class="page-scroll" href="#contact">Contact Us</a>
                </li>

            </ul>
        </div>

    </div>
</nav>

<header id="page-top">
    <div class="container">
        <div class="intro-text">

            <a href="#ocr" class="page-scroll btn btn-xl">Try Free</a>

        </div>
    </div>
    <!-------------About us------------------------------------------------>
    <section id="about" class="bg-light-gray">
        <div class="container" id="about-click">
            <div class="col-lg-12 text-center">
                <h2>About Us</h2>
                <h3 class="section-subheading text-muted">Our aim is to expand the community that contributes to innovation and greet new comers with better options for their future development needs.
                    Viseur contributes to the existing pool of ideas by  including inputs of unexperienced personal computer users, giving fresh options to software development enthusiasts, and to
                    expand the exposure of entrepreneurs and their ideas by involving the business professionals who are interested in profiting through good investments.
                </h3>
            </div>


        </div>

    </section>
    <section id ="Community" class="bg-light-gray">

        <div class="container" id="community-click">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading">Community</h2>

                </div>
            </div>
            <div class="row">
                <div class="col-sm-4">
                    <div class="community-member">
                        <img src="img/traveler.jpg" class=" img-responsive img-rounded" alt="travelers">
                        <h4 class="well-sm" >Traveller</h4>
                        <div  class="col-sm-4">
                            <p class="text-muted">
                                kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                                kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                                kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                            </p>
                        </div>

                    </div>
                </div>
                <div class="col-sm-4">
                    <div class="community-member">
                        <img src="img/traveler.jpg" class=" img-responsive img-rounded" alt="travelers">
                        <h4 class="well-sm" >Traveller</h4>

                        <p class="text-muted">
                            kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                            kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                            kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                        </p>


                    </div>

                </div>
                <div class="col-sm-4">
                    <div class="community-member">
                        <img src="img/traveler.jpg" class=" img-responsive img-rounded" alt="travelers">
                        <h4 class="well-sm" >Traveller</h4>

                        <p class="text-muted">
                            kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                            kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                            kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
                        </p>


                    </div>

                </div>

            </div>
    </section>
    <section id="ocr"  class=" bg-light-gray ">
        <!-- <div class="inside-center">
             <div class="col-lg-12 text-center">


                 <div class="row">

                     <div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-md-offset-1">
                         <div class="row">
                             <p class="pull-left well-sm"> Upload an Image to extract words</p>
                         </div>
                         <div class="row">
                             <span class="btn btn-success btn-file pull-right">Upload
                                 <input type="file" name="upldImge" id="extractimage">
                             </span>
                         </div>
                     </div>
                 </div>




             </div>
         </div>-->
        <div id = "head" class="row " >
            <h4 class="text-center">Upload an Image to be extracted</h4>
        </div>
        <div id =" imageDisplay ">
            <div class=" col-md-6">


                <span class="btn btn-image  btn-file pull-right">Upload
                    <input type="file" name="upldImge" id="extractimage">
                </span>

            </div>
            <div  id =" imageDisplay " class=" col-md-6">


                <span class="btn btn-image btn-file pull-left">Preview
                    <input type="file" name="upldImge" id="extractimage">
                </span>

            </div>

        </div>
    </section>



    <%@include file="footer.jsp" %>
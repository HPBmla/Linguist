<%--
    Document   : home
    Created on : Jan 13, 2016, 8:58:47 AM
    Author     : Bimla Madhavee
--%>


<link href="/Linguist/css/bootstrap.css" rel="stylesheet">
<link href="/Linguist/css/bootstrap.min.css" rel="stylesheet">
<link href="/Linguist/css/otherStyle.css" rel="stylesheet">
<link href="/Linguist/css/otherStyles.css" rel="stylesheet">
<script src="/Linguist/js/bootstrap.min.js"></script>
<script src="/Linguist/js/jquery.min.js"></script>
<script src="/Linguist/js/bootstrap-datepicker.js"></script>
<script src="/Linguist/js/uploadimg.js"></script>


<%@include file="navigationBar.jsp" %>


<header id="page-top">
    <div class="container">
        <div class="intro-text">

            <a href="#ocr" class="page-scroll btn btn-xl">Try Free</a>

        </div>
    </div>
    <!-------------About us------------------------------------------------>
    <section id="about" class="bg-light-gray">
        <div class="container" id="about-click">
            <div id ="servicePortion" class="center-block">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <h2 class="textTitle"> Services </h2>
                        <h3 class="section-subheading text-muted">Our aim is to expand the community that contributes to innovation and greet new comers with better options for their future development needs.
                            Viseur contributes to the existing pool of ideas by  including inputs of unexperienced personal computer users, giving fresh options to software development enthusiasts, and to
                            expand the exposure of entrepreneurs and their ideas by involving the business professionals who are interested in profiting through good investments.
                        </h3>
                    </div>
                </div>

                <div class="row text-center">
                    <div class="col-md-4">
                        <h4 class="serviceTitle">
                            Text Extraction
                        </h4>
                        <p class="textChanged">
                            Text extraction is provided by using
                            Tesseract API where Optical Character
                            Recognition is supported. User can upload
                            any kind of document with text which
                            they wants to extract from the image
                        </p>

                    </div>
                    <div class="col-md-4">
                        <h4 class="serviceTitle">
                            Text Extraction
                        </h4>
                        <p class="textChanged">
                            Text extraction is provided by using
                            Tesseract API where Optical Character
                            Recognition is supported. User can upload
                            any kind of document with text which
                            they wants to extract from the image
                        </p>
                    </div>
                    <div class="col-md-4">
                        <h4 class="serviceTitle">
                            Text Extraction
                        </h4>
                        <p class="textChanged">
                            Text extraction is provided by using
                            Tesseract API where Optical Character
                            Recognition is supported. User can upload
                            any kind of document with text which
                            they wants to extract from the image
                        </p>
                    </div>
                </div>
            </div>

        </div>

    </section>
    <section id ="Community" class="bg-light-gray">

        <div class="container" id="community-click">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2 class="section-heading textTitle">Community</h2>

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
        <div class="container ">
            <div id ="uploadSection" class="center-block">
                <div id = "head" class="row " >
                    <h4 class="text-center textTitle">Upload an Image to be extracted</h4>
                </div>
                <div id =" imageDisplay ">
                    <div class=" col-md-6">


                        <span class="btn btn-image  btn-file pull-right">Upload
                            <input type="file" name="upldImge" id="extractimage">
                        </span>

                    </div>
                    <div  id =" imageDisplay " class=" col-md-6">



                        <a href="imageView.jsp" class= "btn btn-image pull-left">Preview</a>




                    </div>

                </div>
            </div>
            <section id="suggest">
                <div id="uploadSuggest" class="center-block">
                    <div id="suggestHeading" class="row">
                        <h4 class="textTitle center-block"> Send your suggestions to us</h4>
                    </div>
                    <div class="row">
                        <div class="col-md-8 center-block">
                            <p class="pull-left textTitle">Email Address</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8">
                            <input class="form-control" type="text" name="emailAddress" value=""/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8 center-block">
                            <p class="pull-left textTitle">Suggestions related to the website</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-8">

                            <textarea maxlength="100" class=" form-control " name="msg" rows="10" id="Extract-textarea" > </textarea>
                        </div>
                    </div>
                    <div class="row">
                        <div id="imageView" class="col-md-8">
                            <a href="#download" class="btn btn-image pull-left">Suggest</a>
                            <a href="#translate" class="btn btn-default pull-left">Cancel</a>
                        </div>
                    </div>
                </div>

            </section>
        </div>
    </section>



    <%@include file="footer.jsp" %>
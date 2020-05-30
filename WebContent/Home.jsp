<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Home</title>

    <link rel="stylesheet" href="bootstrap-4.0.0-dist/css/bootstrap.min.css"/>
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <!-- Google Fonts -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
    <!-- Bootstrap core CSS -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
    <!-- Material Design Bootstrap -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/css/mdb.min.css" rel="stylesheet">
    
    <style>
        body{
            margin: 0;
            padding: 0;
            display: fixed;
        }
        .navbar-nav {
	       position: absolute;
            right: 0;
}
        .container-fluid {
	       width: 100vw;
            height: 100vh;
            background-image: url('images/Background_Image.png');
            background-repeat: no-repeat;
            background-size: cover;
}
        .nav-link{
            font-family: Amaranth;
            font-size: 20px;
            
        }
        h1{
            font-size: 80px;
            margin-top: 30vh;
            padding-left: 17vw;
            font-family: Berkshire Swash;
        }
        h4{
            padding-left: 21vw;
            position: absolute;
            padding-top: 11vh;
            font-family: Berkshire Swash;
            font-size: 2vw;
        }
        p{
            padding-left: 21vw;
            position: absolute;
            top: 0;right: 0;bottom: 0;left: 0;
            padding-top: 52vh;
            font-family: Berkshire Swash;
            font-size: 1.5vw;
        }
        
        .btn {
	       color: white !important;
            background-color: #f8112c;
            margin-left: 21vw;
        }
        .btn-toolbar a{
            color: white;
        }
        @media only screen and(max-width:400px){
           .row p{
                padding-top: 30vh;
                }
        }
        
    </style>

</head>
<body>

    <div class="container-fluid">
        <nav class="navbar navbar-expand-xl navbar-light">
            
            <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarcontent" aria-controls="navbarcontent" aria-expanded="false" aria-label="Toggle navigation">
                
                <span class="navbar-toggler-icon"></span>
            </button>
            
            <div class="collapse navbar-collapse" id="navbarcontent">
                <ul class="navbar-nav mt-5 pr-5">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contact Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Services</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About Us</a>
                    </li>
                </ul>
            </div>
            
        </nav>
        
        <div class="row">
            <div class="col-12">
                <h1>Online School Information Management System</h1>
                
                <!--a class="btn px-4 py-2 mt-4">Go...!</a-->

                <div class="row">
                    <h4>LogIn To The System As...?</h4>
                    <!---p>YOU ARE A ?</p-->
                </div>

            </div>
        </div>
        <br><br>

        <!--button pannel initializing-->
        <div class="btn-toolbar mt-10 mb-10" style="margin-left: 450px; margin-top: 100px;" role="toolbar" aria-label="Toolbar with button groups">


            <div class="btn-group mr-3" role="group" aria-label="First group">
                <button type="button" class="btn btn-default  px-5" onclick=""><a href="StudentLogin.jsp">Student</a></button>
              
            </div>
            <div class="btn-group mr-3"  role="group" aria-label="Second group">
                <button type="button" class="btn btn-default  px-5" onclick=""><a href="Login.jsp">Teacher</a></button>
                <!--<button type="button" class="btn btn-default">6</button>
                <button type="button" class="btn btn-default">7</button>-->
            </div>
            <div class="btn-group mr-3"  role="group" aria-label="Third group">
                <button type="button" class="btn btn-default  px-5" onclick=""><a href="ClerkLogin.jsp">Clerk</a></button>
            </div>
            <div class="btn-group mr-3" role="group" aria-label="Fourth group">
                <button type="button" class="btn btn-default  px-5" onclick=""><a href="adminLogin.jsp">Admin</a></button>
              </div>
        </div>

        <!--container pannel initializing-->
        <div class="container" style="margin-top: 120px; margin-bottom: 30px;">
            
            <h2 style="margin-bottom: 20px; font-weight: 100;">Extra Curricular Activities</h2>

            <!--ec curriculer pannel initializing-->
            <div class="row">
              <div class="col-sm">
                  <!-- Card Wider -->
                    <div class="card card-cascade wider">
                    
                    <!-- Card image -->
                    <div class="view view-cascade overlay">
                        <img class="card-img-top" src="images/football.jpg" alt="Card image cap">
                        <a href="#!">
                        <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>
                    
                    <!-- Card content -->
                    <div class="card-body card-body-cascade text-center">
                    
                        <h5 class="blue-text pb-2"><strong>Football</strong></h5>
                    
                    </div>
                    
                    </div>
                    <!-- Card Wider -->
              </div>
              <div class="col-sm">
                  <!-- Card Wider -->
                    <div class="card card-cascade wider">
                    
                    <!-- Card image -->
                    <div class="view view-cascade overlay">
                        <img class="card-img-top" src="images/cricket1.jpg" alt="Card image cap">
                        <a href="#!">
                        <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>
                    
                    <!-- Card content -->
                    <div class="card-body card-body-cascade text-center">
                    
                        <h5 class="blue-text pb-2"><strong>Cricket</strong></h5>
                    
                    </div>
                    
                    </div>
                    <!-- Card Wider -->
              </div>
              <div class="col-sm">
                <!-- Card Wider -->
                <div class="card card-cascade wider">
                    
                    <!-- Card image -->
                    <div class="view view-cascade overlay">
                        <img class="card-img-top" src="images/hockey1.jpg" alt="Card image cap">
                        <a href="#!">
                        <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>
                    
                    <!-- Card content -->
                    <div class="card-body card-body-cascade text-center">
                    
                        <h5 class="blue-text pb-2"><strong>Hockey</strong></h5>
                    
                    </div>
                    
                    </div>
                    <!-- Card Wider -->
              </div>
            </div>


            <!----------------------------------//second row----------------------------------->


            <h2 style="margin-top: 30px; margin-bottom: 20px; font-weight: 100;">Subjects</h2>

            <!--subject pannel initializing-->
            <div class="row">
              <div class="col-sm">
                  <!-- Card Wider -->
                    <div class="card card-cascade wider">
                    
                    <!-- Card image -->
                    <div class="view view-cascade overlay">
                        <img class="card-img-top" src="images/english.jpg" alt="Card image cap">
                        <a href="#!">
                        <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>
                    
                    <!-- Card content -->
                    <div class="card-body card-body-cascade text-center">
                    
                        <h5 class="blue-text pb-2"><strong>English</strong></h5>
                    
                    </div>
                    
                    </div>
                    <!-- Card Wider -->
              </div>
              <div class="col-sm">
                  <!-- Card Wider -->
                    <div class="card card-cascade wider">
                    
                    <!-- Card image -->
                    <div class="view view-cascade overlay">
                        <img class="card-img-top" src="images/maths1.jpg" alt="Card image cap">
                        <a href="#!">
                        <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>
                    
                    <!-- Card content -->
                    <div class="card-body card-body-cascade text-center">
                    
                        <h5 class="blue-text pb-2"><strong>Mathematics</strong></h5>
                    
                    </div>
                    
                    </div>
                    <!-- Card Wider -->
              </div>
              <div class="col-sm">
                <!-- Card Wider -->
                <div class="card card-cascade wider">
                    
                    <!-- Card image -->
                    <div class="view view-cascade overlay">
                        <img class="card-img-top" src="images/tamil.jpg" alt="Card image cap">
                        <a href="#!">
                        <div class="mask rgba-white-slight"></div>
                        </a>
                    </div>
                    
                    <!-- Card content -->
                    <div class="card-body card-body-cascade text-center">
                    
                        <h5 class="blue-text pb-2"><strong>Tamil</strong></h5>
                    
                    </div>
                    
                    </div>
                    <!-- Card Wider -->
              </div>
            </div>

        </div>

        <!-- Footer -->
        <footer class="page-footer font-small blue">

            <!-- Copyright -->
            <div class="footer-copyright text-center py-3">© 2020 Copyright:
            <a href="https://com/">Online School Information Management System</a>
            </div>
            <!-- Copyright -->
        
        </footer>
        <!-- Footer -->

    </div>
    
    <script src="bootstrap-4.0.0-dist/js/jquery-3.3.1.min.js"></script>
    <script src="bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>

    <!-- JQuery -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <!-- Bootstrap tooltips -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
    <!-- Bootstrap core JavaScript -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <!-- MDB core JavaScript -->
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/js/mdb.min.js"></script>
</body>
</html>
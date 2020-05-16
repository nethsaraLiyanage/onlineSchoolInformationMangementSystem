<html>
  <head>
      <title>Admin LogIn| OSIMS</title>
      <link rel="title icon" href="images/title-img.png">
      <meta charset="UTF-8">
      <script src="https://kit.fontawesome.com/36fe1a182c.js" crossorigin="anonymous"></script>
      <link rel="stylesheet" href="adminLogin.css">
  </head>

  <body>
    <div class="loginbox">

      <img src="images/avatar.png" class="avatar" alt="">
      <h1>Admin LogIn</h1>
      
      <form action="AdminLoginServlet" method="POST">
        <p>User Name</p>
        <input type="text" name="uname" placeholder="Enter Username">

        <p>Password</p>
        <input type="password" name="pwd" placeholder="Enter Password">

        <input type="Submit" name="login" value="login">

      </form>
    </div>    
  </body>
</html>